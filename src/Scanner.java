import static java.lang.String.format;
import static java.lang.String.join;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

import java.lang.module.ModuleDescriptor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringJoiner;
import java.util.TreeMap;

class Scanner {

  public static void main(String... args) throws Exception {
    if (args.length == 0) {
      System.err.println("Usage: Scanner DIRECTORY [file]");
      return;
    }
    var scanner = new Scanner(args[0]).scan();
    out("%,11d lines%n", scanner.lines);
    out("%,11d distinct scan lines%n", scanner.scans.size());
    out("%,11d artifacts%n", scanner.facts.size());
    var values = scanner.facts.values();
    out("%,11d JAR files are plain%n", values.stream().filter(Scan::isPlain).count());
    out(
        "%,11d JAR files with Automatic-Module-Name%n",
        values.stream().filter(Scan::isAutomatic).count());
    out(
        "%,11d JAR files with module-info.class%n",
        values.stream().filter(Scan::isExplicit).count());
    out("%,11d distinct modules%n", scanner.modules.size());
    out("%,11d unique modules%n", scanner.uniques.size());
    if (args.length == 2) {
      var lines = new ArrayList<String>();
      scanner.uniques.forEach((module, uri) -> lines.add(module + '=' + uri));
      var file = Path.of(args[1]);
      var parent = file.getParent();
      if (parent != null) Files.createDirectories(parent);
      Files.write(file, lines);
      out("Wrote unique module-uri pairs to %s%n", file.toUri());
      lines.clear();
      lines.add("# Modules");
      for (var entry : scanner.modules.entrySet()) {
        var module = entry.getKey();
        var scans = entry.getValue();
        var uri = scanner.uniques.get(module);
        lines.add("");
        lines.add("## " + module);
        lines.add("");
        lines.add(uri == null ? "_Unique URI not available._" : "<" + uri + ">");
        lines.add("");
        scans.stream()
            .parallel()
            .collect(groupingBy(Scan::GA, mapping(Scan::V, toList())))
            .entrySet()
            .stream()
            .map(it -> format("1. `%s` -> [`%s`]", it.getKey(), join("`, `", it.getValue())))
            .sorted()
            .forEach(lines::add);
      }
      Files.write(Path.of("modules.md"), lines);
    }
    if (Boolean.getBoolean("doc")) scanner.transformTextFiles(Path.of("doc"), "*.txt");
    if (Boolean.getBoolean("illegal-automatic-module-names")) {
      var illegal =
          values.stream()
              .filter(Scan::isAutomatic)
              .filter(scan -> isIllegalModuleName(scan.module()))
              .sorted(Comparator.comparing(Scan::GA))
              .map(scan -> String.format("%s:%s -> %s", scan.GA, scan.V, scan.module))
              .toList();
      Files.write(Path.of("doc/suspicious/illegal-automatic-module-names.txt"), illegal);
    }
  }

  static void out(String format, Object... args) {
    System.out.printf(format, args);
  }

  static String computeMavenGroupAlias(String group) {
    return switch (group) {
      case "com.fasterxml.jackson.core" -> "com.fasterxml.jackson";
      case "com.github.almasb" -> "com.almasb";
      case "javax.json" -> "java.json";
      case "net.colesico.framework" -> "colesico.framework";
      case "org.jetbrains.kotlin" -> "kotlin";
      case "org.jfxtras" -> "jfxtras";
      case "org.openjfx" -> "javafx";
      case "org.ow2.asm" -> "org.objectweb.asm";
      case "org.projectlombok" -> "lombok";
      case "org.swimos" -> "swim";
      default -> group.replace("-", "");
    };
  }

  static boolean isIllegalModuleName(String name) {
    try {
      ModuleDescriptor.newModule(name);
      return false;
    } catch (IllegalArgumentException exception) {
      return true;
    }
  }

  final Path directory;
  long lines;
  final HashSet<Scan> scans; // distinct scan lines
  final TreeMap<String, Scan> facts; // "G:A[:C]" -> Scan
  final TreeMap<String, ArrayList<Scan>> modules; // "module" -> [Scan...]
  final TreeMap<String, String> uniques; // "module" -> "uri"

  Scanner(String directory) {
    this.directory = Path.of(directory);
    this.scans = new HashSet<>();
    this.facts = new TreeMap<>();
    this.modules = new TreeMap<>();
    this.uniques = new TreeMap<>();
  }

  Scanner scan() throws Exception {
    var files = new ArrayList<Path>();
    try (var stream = Files.newDirectoryStream(directory, "*.csv")) {
      stream.forEach(files::add);
    }
    files.sort(Comparator.comparing(Path::getFileName));
    out("Scanning %d files in %s...%n", files.size(), directory);
    for (var file : files) scanFile(file);
    return this;
  }

  void scanFile(Path file) throws Exception {
    for (var string : Files.readAllLines(file)) {
      lines++;
      var line = new Line(string);
      if (line.skip()) continue;
      var scan = line.scan();
      if (scans.add(scan)) {
        facts.put(scan.GA, scan);
        if (scan.isExplicit()) {
          modules.computeIfAbsent(scan.module(), key -> new ArrayList<>()).add(scan);
          if (scan.isUnique()) uniques.put(scan.module(), scan.toUri());
        }
      }
    }
  }

  void transformTextFiles(Path directory, String glob) throws Exception {
    try (var stream = Files.newDirectoryStream(directory, glob)) {
      var iterator = stream.iterator();
      while (iterator.hasNext()) transformTextFile(iterator.next());
    }
  }

  void transformTextFile(Path file) throws Exception {
    var md = new ArrayList<String>();
    md.add("# " + file.getFileName());
    var summary = md.size();
    md.add("");
    md.add("|   | Module | Group and Artifact | Version |");
    md.add("|---|:-------|:-------------------|---------|");
    int total = 0;
    int explicit = 0;
    int automatic = 0;
    int plain = 0;
    int unknown = 0;
    for (var line : Files.readAllLines(file)) {
      var trim = line.trim();
      if (trim.startsWith("#")) continue;
      total++;
      var scan = facts.get(trim);
      if (scan == null) {
        unknown++;
        continue;
      }
      var kind = scan.isExplicit() ? "🧩" : scan.isAutomatic() ? "⬜" : "⚪";
      if (scan.isExplicit()) explicit++;
      else if (scan.isAutomatic()) automatic++;
      else plain++;
      var name = scan.isPlain() ? "" : "`" + scan.module + "`";
      var version = scan.isExplicit() && scan.isUnique() ? "**" + scan.V + "**" : scan.V;
      md.add("| " + kind + " | " + name + " | `" + trim + "` | " + version + " |");
    }
    if (total > 0) {
      md.add(summary + 0, "");
      md.add(
          summary + 1,
          format(
              "- 🧩 %,d (%.1f%%) Java modules (module descriptor with stable name and API)",
              explicit, explicit * 100d / total));
      md.add(
          summary + 2,
          format(
              "- ⬜ %,d (%.1f%%) Automatic Java modules (name derived from JAR manifest)",
              automatic, automatic * 100d / total));
      md.add(
          summary + 3,
          format(
              "- ⚪ %,d (%.1f%%) Automatic Java modules (name derived from JAR filename)",
              plain, plain * 100d / total));
      md.add(
          summary + 4,
          format(
              "- ➖ %,d (%.1f%%) Unrelated artifacts (BOM, POM, ... or not recently updated)",
              unknown, unknown * 100d / total));
    }
    Files.write(file.resolveSibling(file.getFileName() + ".md"), md);
  }

  record Line(String string) {

    boolean skip() {
      return isLineWithCaption() || !isLineWithEightCommas();
    }

    boolean isLineWithCaption() {
      return string.equals(
          "groupId,artifactId,version,"
              + "moduleName,moduleVersion,moduleMode,"
              + "moduleDependencies,jdepsToolError,jdepsViolations");
    }

    boolean isLineWithEightCommas() {
      return string.chars().filter(ch -> ch == ',').count() == 8;
    }

    Scan scan() {
      return Scan.of(string);
    }
  }

  // https://github.com/sandermak/modulescanner/blob/master/src/main/java/org/adoptopenjdk/modulescanner/SeparatedValuesPrinter.java
  record Scan(String G, String G2, String A, String GA, String V, String module, String kind) {

    boolean isAutomatic() {
      return kind.equals("automatic");
    }

    boolean isExplicit() {
      return kind.equals("explicit");
    }

    boolean isPlain() {
      return !(isAutomatic() || isExplicit());
    }

    boolean isUnique() {
      return module.startsWith(G) || module.startsWith(G2);
    }

    String toUri() {
      return new StringJoiner("/")
          .add("https://repo.maven.apache.org/maven2")
          .add(G.replace('.', '/'))
          .add(A)
          .add(V)
          .add(A + '-' + V + ".jar")
          .toString();
    }

    static Scan of(String line) {
      var values = line.split(",");
      if (values.length < 9) {
        throw new IllegalArgumentException(
            "Expected at least 9 values, only got " + values.length + " in: " + line);
      }
      var G = values[0];
      var G2 = computeMavenGroupAlias(G);
      var A = values[1];
      var GA = G + ':' + A;
      var V = values[2];
      var module = values[3];
      // moduleVersion = values[4];
      var moduleKind = values[5]; // "explicit", "automatic", <?>
      return new Scan(G, G2, A, GA, V, module, moduleKind);
    }
  }
}
