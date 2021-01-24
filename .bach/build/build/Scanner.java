package build;

import static java.lang.String.format;
import static java.lang.String.join;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

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
    System.out.printf("Found %d distinct explicit module names.%n", scanner.modules.size());
    System.out.printf("Collected unique %d modules.%n", scanner.uniques.size());
    if (args.length == 2) {
      var lines = new ArrayList<String>();
      scanner.uniques.forEach((module, uri) -> lines.add(module + '=' + uri));
      var file = Path.of(args[1]);
      var parent = file.getParent();
      if (parent != null) Files.createDirectories(parent);
      Files.write(file, lines);
      System.out.printf("Wrote unique module-uri pairs to %s%n", file.toUri());
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

  final Path directory;
  final HashSet<Scan> scans;
  final TreeMap<String, ArrayList<Scan>> modules; // "module" -> [Scan...]
  final TreeMap<String, String> uniques; // "module" -> "uri"

  Scanner(String directory) {
    this.directory = Path.of(directory);
    this.scans = new HashSet<>();
    this.modules = new TreeMap<>();
    this.uniques = new TreeMap<>();
  }

  Scanner scan() throws Exception {
    var files = new ArrayList<Path>();
    try (var stream = Files.newDirectoryStream(directory, "*.csv")) {
      stream.forEach(files::add);
    }
    files.sort(Comparator.comparing(Path::getFileName));
    System.out.printf("Scanning %d files in %s...%n", files.size(), directory);
    for (var file : files) scanFile(file);
    return this;
  }

  void scanFile(Path file) throws Exception {
    for (var string : Files.readAllLines(file)) {
      var line = new Line(string);
      if (line.skip()) continue;
      var scan = line.scan();
      if (scans.add(scan)) {
        if (scan.explicit) {
          modules.computeIfAbsent(scan.module(), key -> new ArrayList<>()).add(scan);
          if (scan.isUnique()) uniques.put(scan.module(), scan.toUri());
        }
      }
    }
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
  record Scan(String G, String G2, String A, String GA, String V, String module, boolean explicit) {

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
      var explicit = "explicit".equals(values[5]);
      return new Scan(G, G2, A, GA, V, module, explicit);
    }
  }
}
