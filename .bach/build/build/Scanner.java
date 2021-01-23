package build;

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
    System.out.printf("Found %d distinct explicit module names.%n", scanner.explicits.size());
    System.out.printf("Collected unique %d modules.%n", scanner.modules.size());
    if (args.length == 2) {
      var lines = new ArrayList<String>();
      scanner.modules.forEach((module, uri) -> lines.add(module + '=' + uri));
      var file = Path.of(args[1]);
      var parent = file.getParent();
      if (parent != null) Files.createDirectories(parent);
      Files.write(file, lines);
      System.out.printf("Wrote unique module-uri pairs to %s%n", file.toUri());
      lines.clear();
      lines.add("# Modules");
      for (var entry : scanner.explicits.entrySet()) {
        var module = entry.getKey();
        var scans = entry.getValue();
        lines.add("");
        lines.add("## " + module);
        lines.add("");
        lines.add("Unique URI: <" + scanner.modules.getOrDefault(module, "n.a.") + ">");
        lines.add("");
        var strings = new ArrayList<String>();
        for (var scan : scans) strings.add("- " + scan.GA + ":" + scan.V);
        strings.stream().sorted().forEach(lines::add);
      }
      Files.write(Path.of("modules.md"), lines);
    }
  }

  @SuppressWarnings("RedundantIfStatement")
  static boolean unique(Scan scan) {
    if (scan.module().startsWith(scan.G())) return true;
    if (scan.module().startsWith(scan.G2())) return true;
    return false;
  }

  static String computeMavenGroupAlias(String group) {
    return switch (group) {
      case "com.github.almasb" -> "com.almasb";
      case "javax.json" -> "java.json";
      case "org.jetbrains.kotlin" -> "kotlin";
      case "org.jfxtras" -> "jfxtras";
      case "org.openjfx" -> "javafx";
      case "org.ow2.asm" -> "org.objectweb.asm";
      case "org.projectlombok" -> "lombok";
      default -> group.replace("-", "");
    };
  }

  final Path directory;
  final HashSet<Scan> scans;
  final TreeMap<String, ArrayList<Scan>> explicits; // "module" -> [Scan...]
  final TreeMap<String, String> modules; // "module" -> "uri"

  Scanner(String directory) {
    this.directory = Path.of(directory);
    this.scans = new HashSet<>();
    this.explicits = new TreeMap<>();
    this.modules = new TreeMap<>();
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
          explicits.computeIfAbsent(scan.module(), key -> new ArrayList<>()).add(scan);
          if (unique(scan)) modules.put(scan.module(), scan.uri());
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

    String uri() {
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
