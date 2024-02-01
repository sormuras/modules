import java.lang.module.ModuleDescriptor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Database {
  public static void main(String... args) throws Exception {
    var directory = Path.of(args[0]);
    var out = Files.createDirectories(Path.of("out"));

    var cache = out.resolve("cached-lines.csv");
    if (!Files.isReadable(cache)) {
      var files = new ArrayList<Path>();
      try (var stream = Files.newDirectoryStream(directory, "*.csv")) {
        stream.forEach(files::add);
      }
      files.sort(Comparator.comparing(Path::getFileName));
      System.out.printf("Reading %d files in %s...%n", files.size(), directory);
      var lines = new LinkedHashSet<String>(files.size(), 1);
      for (int i = 0; i < files.size(); i++) {
        var file = files.get(i);
        if (i % 1000 == 0) System.out.println(file);
        lines.addAll(Files.readAllLines(file));
      }
      System.out.printf("Found %d distinct lines in %d files.%n", lines.size(), files.size());
      Files.write(cache, lines);
      System.out.printf("Wrote cache of size %d bytes to %s%n", Files.size(cache), cache);
    }
    System.out.printf("Loading cache from %s with %s bytes%n", cache, Files.size(cache));
    var lines = new ArrayList<>(Files.readAllLines(cache));
    System.out.printf("Loaded %d distinct lines from cache: %s%n", lines.size(), cache);

    /*
    lines.removeIf(line -> !line.contains(",explicit,"));
    System.out.printf("Found %d lines with an explicit module marker.%n", lines.size());
    Files.write(Path.of("out/explicit-lines.csv"), lines);

    var errors = new TreeMap<String, Exception>();
    var artifacts = new TreeMap<String, List<Entry>>();
    var module = new TreeMap<String, List<Entry>>();
    var unique = new TreeMap<String, List<Entry>>();
    var modest = new TreeMap<String, List<Entry>>();
    for (var line : lines) {
      try {
        var entry = Entry.of(line);
        artifacts.computeIfAbsent(entry.toGA(), __ -> new ArrayList<>()).add(entry);
        var name = entry.module().name();
        module.computeIfAbsent(name, __ -> new ArrayList<>()).add(entry);
        if (!entry.isUniqueModule()) continue;
        unique.computeIfAbsent(name, __ -> new ArrayList<>()).add(entry);
        if (!entry.isModestModule()) continue;
        modest.computeIfAbsent(name, __ -> new ArrayList<>()).add(entry);
      } catch (IllegalArgumentException exception) {
        errors.put(line, exception);
      }
    }
    System.out.printf("Found %d lines with module-related errors.%n", errors.size());
    write(Path.of("out/line-errors.properties"), errors);

    System.out.printf("Found %d distinct group:artifact (no version) entries.%n", artifacts.size());
    write(
        Path.of("out/distinct-artifacts.properties"),
        artifacts,
        entries -> entries.stream().map(Entry::version).toList().toString());

    System.out.printf("Found %d explicit modules.%n", module.size());
    write(
        Path.of("out/explicit-modules-first.properties"),
        module,
        entries -> entries.getFirst().toGAV());
    write(
        Path.of("out/explicit-modules-last.properties"),
        module,
        entries -> entries.getLast().toGAV());

    System.out.printf("Found %d unique modules.%n", unique.size());
    write(Path.of("out/unique-modules.properties"), unique, entries -> entries.getLast().toGAV());

    System.out.printf("Found %d modest modules.%n", modest.size());
    write(Path.of("out/modest-modules.properties"), modest, entries -> entries.getLast().toGAV());
    */

    var projects =
        List.of(
            new Project(
                "JUnit 5",
                entry ->
                    entry.toGA().startsWith("org.junit.")
                        || entry.groupId().equals("org.opentest4j")
                        || entry.groupId().equals("org.apiguardian"),
                new ArrayList<>()));

    var all = new HashSet<Entry>();
    for (var line : lines) {
      if ("groupId,artifactId,version,moduleName,moduleVersion,moduleMode,moduleDependencies,jdepsToolError,jdepsViolations"
          .equals(line)) continue;
      // if (!line.contains(",explicit,")) continue;
      if (!line.contains(",explicit,") && !line.contains(",automatic,")) continue;
      try {
        var entry = Entry.of(line);
        all.add(entry);

        for (var project : projects) {
          if (project.predicate().test(entry)) project.entries().add(entry);
        }
      } catch (Exception exception) {
        // System.err.println("line -> " + line);
        // throw exception;
      }
    }
    for (var project : projects) {
      System.out.println("## Project " + project.name());
      for (var entry : project.entries()) {
        System.out.println("  - " + entry.toGAV());
      }
    }
  }

  record Entry(String groupId, String artifactId, String version, ModuleDescriptor module) {
    static Entry of(String line) {
      var values = line.split(",");
      var groupId = values[0];
      var artifactId = values[1];
      var version = values[2];
      if (SYSTEM_MODULE_NAMES.contains(values[3]))
        throw new IllegalArgumentException(values[3] + " is a name of a system module");
      var module = ModuleDescriptor.newModule(values[3]);
      if (!values[4].equals("-")) module.version(values[4]);
      // assert "explicit".equals(values[5]);
      if (!values[6].equals("-")) Arrays.stream(values[6].split(" \\+ ")).forEach(module::requires);
      return new Entry(groupId, artifactId, version, module.build());
    }

    boolean isUniqueModule() {
      return module.name().startsWith(groupId);
    }

    boolean isModestModule() {
      var externals =
          module.requires().stream()
              .filter(requires -> !SYSTEM_MODULE_NAMES.contains(requires.name()))
              .toList();
      return externals.isEmpty();
    }

    String toGA() {
      return groupId + ':' + artifactId;
    }

    String toGAV() {
      return groupId + ':' + artifactId + ':' + version;
    }
  }

  static final TreeSet<String> SYSTEM_MODULE_NAMES =
      Object.class.getModule().getLayer().modules().stream()
          .map(Module::getName)
          .collect(Collectors.toCollection(TreeSet::new));

  static void write(Path path, Map<String, ?> map) {
    write(path, map, Object::toString);
  }

  static <T> void write(Path path, Map<String, T> map, Function<T, String> function) {
    var lines = new ArrayList<String>();
    for (var entry : map.entrySet()) {
      var line = entry.getKey().replace(":", "\\:") + '=' + function.apply(entry.getValue());
      lines.add(line);
    }
    try {
      Files.write(path, lines);
    } catch (Exception exception) {
      throw new RuntimeException(exception);
    }
  }

  record Project(String name, Predicate<Entry> predicate, ArrayList<Entry> entries) {}
}
