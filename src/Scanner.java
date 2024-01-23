import static java.lang.String.format;
import static java.lang.String.join;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

import java.lang.module.ModuleDescriptor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    Files.createDirectories(Path.of("out"));
    out("%,11d composable modules%n", scanner.composables.size());
    Files.write(Path.of("out", "composable-modules.txt"), scanner.composables);
    out("-%n");
    out("%,11d in total required modules%n", scanner.requires.size());
    Files.write(Path.of("out", "total-requires.txt"), scanner.requires);
    var unknown = new TreeSet<>(scanner.requires);
    unknown.removeAll(scanner.uniques.keySet());
    unknown.removeAll(scanner.modules.keySet());
    SYSTEM_MODULE_NAMES.forEach(unknown::remove);
    out("%,11d unknown required modules%n", unknown.size());
    Files.write(Path.of("out", "unknown-requires.txt"), unknown);
    if (args.length == 2) {
      var lines = new ArrayList<String>();
      scanner.uniques.forEach((module, uri) -> lines.add(module + '=' + uri));
      var file = Path.of(args[1]);
      var parent = file.getParent();
      if (parent != null) Files.createDirectories(parent);
      Files.write(file, lines);
      out("Wrote unique module-uri pairs to %s%n", file.toUri());
    }
    if (Boolean.getBoolean("badges")) scanner.writeBadgeTables(Path.of("doc", "badges"));
    if (Boolean.getBoolean("doc")) scanner.writeDocTables(Path.of("doc"), "*.txt");
    if (Boolean.getBoolean("illegal-automatic-module-names")) {
      var lines =
          scanner
              .scansWithIllegalAutomaticModuleNames()
              .map(scan -> String.format("%s:%s -> %s", scan.GA, scan.V, scan.module))
              .toList();
      Files.write(Path.of("doc/suspicious/illegal-automatic-module-names.txt"), lines);
    }
    if (Boolean.getBoolean("impostor-modules")) {
      var impostors = scanner.searchImpostors();
      impostors.sort(Comparator.comparing(it -> -it.lines.size()));
      var lines = new ArrayList<String>();
      lines.add("# Impostor Modules");
      lines.add("");
      lines.add(
          """
          An impostor module is a Maven artifact that contains the `module-info.class` file from a different Maven artifact.
          Some well known modules that were packaged as Maven artifacts by their authors, have been repackaged into dozens of other Maven artifacts by the maintainers of those other artifacts.
          This makes it look like there are dozens of modules with the same name in Maven Central -- all but one are impostor modules.""");
      lines.add("");
      impostors.stream()
          .limit(25)
          .map(it -> String.format("1. `%s` x%d", it.module, it.lines().size()))
          .forEach(lines::add);
      lines.add("1. _... and some more._");
      for (var impostor : impostors) {
        var module = impostor.module;
        var size = impostor.lines.size();
        if (size < 3) continue; // skip small impostor sets in order to keep the file size small
        lines.add("");
        lines.add("## " + module);
        if (size >= 10) {
          lines.add("");
          lines.add(
              """
              For example, at least %d artifacts on Maven Central claim to be the module `%s`, but only one of those artifacts is the "real" (annotated with a 🧩 tag) module.
              If your project depends on the one true artifact and _any_ of the other artifacts, then you will experience problems when your module tries to say `requires %s;`."""
                  .formatted(size, module, module));
          }
        lines.add("");
        impostor.lines.forEach(lines::add);
      }
      Files.write(Path.of("doc/suspicious/impostor-modules.md"), lines);
    }
  }

  static void out(String format, Object... args) {
    System.out.printf(format, args);
  }

  static String computeMavenGroupAlias(String group) {
    return switch (group) {
      case "com.fasterxml.jackson.core" -> "com.fasterxml.jackson";
      case "com.github.almasb" -> "com.almasb";
      case "io.github.openfeign" -> "feign";
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
  final TreeMap<String, String> uniqueGAs; // "module" -> "GA"
  final TreeSet<String> composables;
  final TreeSet<String> requires; // ["module", "module.b", ... "module.z"]

  Scanner(String directory) {
    this.directory = Path.of(directory);
    this.scans = new HashSet<>();
    this.facts = new TreeMap<>();
    this.modules = new TreeMap<>();
    this.uniques = new TreeMap<>();
    this.uniqueGAs = new TreeMap<>();
    this.composables = new TreeSet<>();
    this.requires = new TreeSet<>();
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
    var traceMaven = System.getProperty("trace-maven");
    var traceModule = System.getProperty("trace-module");
    for (var string : Files.readAllLines(file)) {
      lines++;
      var line = new Line(string);
      if (line.skip()) continue;
      var scan = line.scan();
      if (scans.add(scan)) {
        facts.put(scan.GA, scan);
        if (scan.GA.equals(traceMaven)) out("%s%n", scan);
        var module = scan.module();
        if (module.equals(traceModule)) out("%s%n", scan);
        if (scan.isExplicit()) {
          modules.computeIfAbsent(module, key -> new ArrayList<>()).add(scan);
          if (scan.isUnique()) {
            uniques.put(module, scan.toUri());
            uniqueGAs.put(module, scan.GA);
            requires.addAll(scan.requires());
            if (scan.isComposable()) composables.add(module);
          }
        }
      }
    }
  }

  Stream<Scan> scansWithIllegalAutomaticModuleNames() {
    return facts.values().stream()
        .filter(Scan::isAutomatic)
        .filter(scan -> isIllegalModuleName(scan.module()))
        .sorted(Comparator.comparing(Scan::GA));
  }

  List<Impostor> searchImpostors() throws Exception {
    var impostors = new ArrayList<Impostor>();
    for (var entry : modules.entrySet()) {
      var module = entry.getKey();
      var uniqueGA = uniqueGAs.get(module);
      var scans = entry.getValue();
      var lines =
          scans.stream()
              .parallel()
              .collect(groupingBy(Scan::GA, mapping(Scan::V, toList())))
              .entrySet()
              .stream()
              .map(it -> format("1. `%s` %s -> [`%s`]",
                  it.getKey(),
                  it.getKey().equals(uniqueGA) ? "🧩" : "",
                  join("`, `", it.getValue())))
              .sorted()
              .toList();
      if (lines.size() > 1) impostors.add(new Impostor(module, lines));
    }
    return impostors;
  }

  void writeBadgeTables(Path directory) throws Exception {
    for (var line : Files.readAllLines(directory.resolve("badges.txt"))) {
      var trim = line.trim();
      if (trim.isEmpty() || trim.startsWith("#")) continue;
      var fact = facts.get(trim);
      if (fact == null) continue; // quick sanity check before streaming all scans
      var hits = new ArrayList<String>();
      hits.add("# Badges of " + fact.G + ":" + fact.A);
      hits.add("");      
      for (var scan : scans) {
        if (scan.GA.equals(line)) {
          hits.add("## Version " + scan.V);
          hits.add("");
          if (scan.isExplicit()) {
            hits.add("- ![module-maturity](https://img.shields.io/badge/module--maturity-explicit-green)");
            hits.add("- ![module-name](https://img.shields.io/badge/module--name-"+scan.module+"-green)");
            continue;
          }
          hits.add("- `" + scan + "`");
        }
      }
      Files.write(directory.resolve("badges-" + fact.G + "-" + fact.A + ".md"), hits);
    }
  }

  void writeDocTables(Path directory, String glob) throws Exception {
    try (var stream = Files.newDirectoryStream(directory, glob)) {
      var iterator = stream.iterator();
      while (iterator.hasNext()) writeDocTable(iterator.next());
    }
  }

  void writeDocTable(Path file) throws Exception {
    var md = new ArrayList<String>();
    md.add("# " + file.getFileName());
    var summary = md.size();
    md.add("");
    md.add("|   | Module | Group and Artifact |");
    md.add("|---|:-------|:-------------------|");
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
      md.add("| " + kind + " | " + name + " | `" + trim + "` |");
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
  record Scan(String G, String G2, String A, String GA, String V, String module, String kind, List<String> requires) {

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

    boolean isComposable() {
      var requires = new HashSet<>(requires());
      requires.removeAll(SYSTEM_MODULE_NAMES);
      return requires.isEmpty();
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
      var moduleDependencies = values[6]; // "-" or "a" or "a + b + ... z"
      var moduleRequires = computeRequires(moduleDependencies);
      return new Scan(G, G2, A, GA, V, module, moduleKind, moduleRequires);
    }

    private static List<String> computeRequires(String moduleDependencies) {
      if (moduleDependencies == null || moduleDependencies.isBlank() || moduleDependencies.equals("-")) return List.of();
      return Arrays.stream(moduleDependencies.split(" \\+ ")).toList();
    }
  }

  record Impostor(String module, List<String> lines) {}

  static final Set<String> SYSTEM_MODULE_NAMES = Object.class.getModule().getLayer().modules().stream()
          .map(Module::getName).collect(Collectors.toSet());
}
