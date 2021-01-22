package build;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringJoiner;
import java.util.TreeMap;

class Scanner {

  public static void main(String... args) throws Exception {
    if (args.length == 0) {
      System.err.println("Usage: Scanner DIRECTORY [file]");
      return;
    }
    var scanner = new Scanner(args[0]).scan();
    System.out.printf("Tree contains %d entries.%n", scanner.modules().size());
    if (args.length == 2) {
      var lines = new ArrayList<String>();
      scanner.modules.forEach((module, uri) -> lines.add(module + '=' + uri));
      Files.write(Path.of(args[1]), lines);
    }
  }

  @SuppressWarnings("RedundantIfStatement")
  static boolean filter(Scan scan) {
    if (!scan.explicit()) return false;
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
      default -> group.replace("-", "");
    };
  }

  final Path directory;
  final TreeMap<String, String> modules;

  Scanner(String directory) {
    this.directory = Path.of(directory);
    this.modules = new TreeMap<>();
  }

  public TreeMap<String, String> modules() {
    return modules;
  }

  Scanner scan() throws Exception {
    System.out.println(directory);
    var files = new ArrayList<Path>();
    try (var stream = Files.newDirectoryStream(directory, "*.csv")) {
      stream.forEach(files::add);
    }
    files.sort(Comparator.comparing(Path::getFileName));
    System.out.println("Scan " + files.size() + " files");
    for (var file : files) scanFile(file);
    System.out.println("Scanned " + files.size() + " files");
    System.out.println("Listed " + modules.size() + " modules");
    return this;
  }

  void scanFile(Path file) throws Exception {
    for (var string : Files.readAllLines(file)) {
      var line = new Line(string);
      if (line.skip()) continue;
      var scan = line.scan();
      if (filter(scan)) modules.put(scan.module(), scan.uri());
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
  record Scan(String G, String G2, String A, String V, String module, boolean explicit) {

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
      var V = values[2];
      var module = values[3];
      // moduleVersion = values[4];
      var explicit = "explicit".equals(values[5]);
      return new Scan(G, G2, A, V, module, explicit);
    }
  }
}
