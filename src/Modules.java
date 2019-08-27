/*
 * Copyright 2019 Christian Stein
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import javax.lang.model.SourceVersion;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import static java.lang.System.Logger.Level.DEBUG;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Modules {

  private static final System.Logger logger = System.getLogger(Modules.class.getName());
  private static final Properties mavenGroupAlias = new Properties();

  private static boolean isModuleRelatedLine(String line, Summary summary) {
    if (line.chars().filter(ch -> ch == ',').count() < 8) {
      return false; // skip "garbage" line, mostly overflows from jdeps errors/violations
    }
    if (line.equals(
        "groupId,artifactId,version,moduleName,moduleVersion,moduleMode,moduleDependencies,jdepsToolError,jdepsViolations")) {
      summary.linesCaptionCounter++;
      return false; // skip caption line
    }
    if (line.contains(",-,-,?,-,")) {
      return false; // skip plain jars - not automatic, nor explicit
    }
    if (summary.lines.contains(line)) {
      summary.linesDuplicateCounter++;
      return false; // skip duplicated line
    }
    return true;
  }

  public static void main(String... args) throws Exception {
    var folder = Path.of(args.length == 0 ? "." : args[0]).normalize().toAbsolutePath();
    logger.log(DEBUG, "folder = {0}", folder);
    try (var stream = new FileInputStream("maven-group-alias.properties")) {
      mavenGroupAlias.load(stream);
    }
    logger.log(DEBUG, "aliases = {0}", mavenGroupAlias);

    var summary = new Summary(folder);
    System.out.printf("%nScanning %s files in %s for modules...%n%n", summary.paths.size(), folder);

    for (var path : summary.paths) {
      logger.log(DEBUG, "Reading all lines: {0}", path);
      for (var line : Files.readAllLines(path)) {
        summary.linesCounter++;
        if (isModuleRelatedLine(line, summary)) {
          summary.lines.add(line);
          logger.log(DEBUG, "Parsing line: {0}", line);
        } else {
          continue;
        }

        var candidate = new Module(line);
        var name = candidate.moduleName;

        var module = summary.modules.get(name);
        if (module == null) {
          // brand new module!
          if (!SourceVersion.isName(name)) {
            logger.log(
                DEBUG, "Module name {0} is syntactically invalid! {1}", name, candidate.line);
            summary.suspiciousSyntax.add(candidate);
            continue;
          }
          if (name.startsWith(candidate.mavenGroupId)) {
            logger.log(
                DEBUG,
                "Module name {0} starts with its group id: {1}",
                name,
                candidate.mavenGroupId);
            summary.modules.put(name, candidate);
            continue;
          }
          var sanitized = candidate.mavenGroupId.replace("-", "");
          if (name.startsWith(sanitized)) {
            logger.log(
                DEBUG,
                "Module name {0} starts with its 'sanitized' group id: {1}",
                name,
                candidate.mavenGroupId);
            summary.modules.put(name, candidate);
            continue;
          }
          var alias = mavenGroupAlias.getProperty(candidate.mavenGroupId);
          if (alias != null && name.startsWith(alias)) {
            logger.log(DEBUG, "Module name {0} starts with a group alias", name);
            summary.modules.put(name, candidate);
            continue;
          }
          summary.suspiciousNaming.add(candidate);
          continue;
        }

        // already known module
        if (module.mavenGroupColonArtifact.equals(candidate.mavenGroupColonArtifact)) {
          var now = candidate.mavenVersion;
          var old = module.mavenVersion;
          if (Objects.equals(now, old)) {
            logger.log(DEBUG, "Version duplication detected: {0}", candidate.line);
            continue;
          }
          logger.log(DEBUG, "Version of module {0} set to {1} (was={2}) ", name, now, old);
          summary.modules.put(name, candidate);
          continue;
        }

        logger.log(DEBUG, "Impostor detected! {0}", candidate);
        summary.suspiciousImpostors.add(candidate);
      }
    }

    summary.write();
  }

  static class Module implements Comparable<Module> {

    final String line;

    final String mavenGroupId;
    final String mavenArtifactId;
    final String mavenVersion;
    final String mavenGroupColonArtifact;

    final String moduleName;
    final String moduleVersion;
    final String moduleMode;
    final List<String> moduleDependencies;

    final String jdepsToolError;
    final List<String> jdepsViolations;

    // https://github.com/sandermak/modulescanner/blob/master/src/main/java/org/adoptopenjdk/modulescanner/SeparatedValuesPrinter.java
    Module(String line) {
      this.line = line;
      var values = line.split(",");
      if (values.length < 9) {
        throw new IllegalArgumentException(
            "Expected at least 9 values, only got " + values.length + " in: " + line);
      }
      //
      this.mavenGroupId = blankIfDash(values[0]);
      this.mavenArtifactId = blankIfDash(values[1]);
      this.mavenVersion = blankIfDash(values[2]);
      this.mavenGroupColonArtifact = mavenGroupId + ':' + mavenArtifactId;
      //
      this.moduleName = blankIfDash(values[3]);
      this.moduleVersion = blankIfDash(values[4]);
      this.moduleMode = blankIfDash(values[5]);
      this.moduleDependencies = List.of(values[6].split(" \\+ "));
      //
      this.jdepsToolError = blankIfDash(values[7]);
      this.jdepsViolations = List.of(values[8].split(" \\+ "));
    }

    @Override
    public int compareTo(Module other) {
      return line.compareTo(other.line);
    }

    @Override
    public boolean equals(Object obj) {
      if (obj == null) {
        return false;
      }
      if (!(obj instanceof Module)) {
        return false;
      }
      var other = (Module) obj;
      return Objects.equals(this.line, other.line);
    }

    @Override
    public int hashCode() {
      return Objects.hashCode(line);
    }

    boolean isAutomatic() {
      return "automatic".equals(moduleMode);
    }

    boolean isExplicit() {
      return "explicit".equals(moduleMode);
    }

    String name() {
      return moduleName;
    }

    String toMarkdown() {
      var icon = toMarkdownModuleModeIcon();
      var maven = "`" + toMaven() + "`";
      return "- " + icon + " `" + moduleName + "` :left_right_arrow: " + maven;
    }

    String toMarkdownModuleModeIcon() {
      switch (moduleMode) {
        case "automatic":
          return ":cd:";
        case "explicit":
          return ":dvd:";
        default:
          return "?";
      }
    }

    String toMaven() {
      return mavenGroupColonArtifact + ":" + mavenVersion;
    }

    @Override
    public String toString() {
      return moduleName + " -> " + toMaven();
    }

    private static String blankIfDash(String value) {
      return "-".equals(value) ? "" : value;
    }
  }

  static class Summary {
    /** Start instant. */
    final Instant startInstant = Instant.now();

    /** All modules. */
    final Map<String, Module> modules = new TreeMap<>();

    /** CSV files to scan. */
    final List<Path> paths;

    /** Unique line set. */
    final Set<String> lines = new HashSet<>();

    long linesCounter = 0L;
    long linesCaptionCounter = 0L;
    long linesDuplicateCounter = 0L;

    final Set<Module> suspiciousImpostors = new TreeSet<>();
    final Set<Module> suspiciousNaming = new TreeSet<>();
    final Set<Module> suspiciousSyntax = new TreeSet<>();

    Summary(Path root) throws Exception {
      try (var stream = Files.walk(root)) {
        this.paths = stream.filter(Files::isRegularFile).sorted().collect(toList());
      }
    }

    List<String> toStrings() {
      var duration = Duration.between(startInstant, Instant.now()).toSeconds();
      var automatics = modules.values().stream().filter(Module::isAutomatic).collect(toList());
      var explicits = modules.values().stream().filter(Module::isExplicit).collect(toList());
      if (modules.size() != explicits.size() + automatics.size()) {
        throw new AssertionError("Sum mismatch!");
      }
      return List.of(
          "## Summary",
          "",
          String.format("Started scan at %s", startInstant),
          String.format("Scanned %,d files in %d seconds.", paths.size(), duration),
          String.format("   first -> %s", paths.get(0).getFileName()),
          String.format("    last -> %s", paths.get(paths.size() - 1).getFileName()),
          "",
          String.format("Parsed %,d lines in total.", linesCounter),
          String.format("  %,d -> captions skipped", linesCaptionCounter),
          String.format("  %,d -> duplicates skipped", linesDuplicateCounter),
          String.format("  %,d -> module related", lines.size()),
          "",
          String.format("Collected %,d unique modules.", modules.size()),
          String.format("  automatic :cd: -> %,d", automatics.size()),
          String.format("  explicit :dvd: -> %,d", explicits.size()),
          "",
          "## Samples",
          sample("junit"),
          sample("org.junit.jupiter"),
          sample("org.objectweb.asm"),
          sample("com.google.common"),
          sample("org.joda.beans"),
          sample("org.joda.collect"),
          sample("org.joda.convert"),
          "");
    }

    String sample(String name) {
      var module = modules.get(name);
      return String.format("%17s -> %s", name, module == null ? "?" : module.toMaven());
    }

    List<String> toMarkdown(List<String> summaryLines) throws Exception {
      var md = new ArrayList<String>();
      md.add("# sormuras/modules");
      md.add("Counted " + modules.size() + " Java modules published at Maven Central");
      md.add("");
      md.add("## Summary " + startInstant);
      md.add("");
      md.add("```");
      md.addAll(summaryLines);
      md.add("```");
      md.add("");
      md.addAll(Files.readAllLines(Path.of("README_ABOUT.md")));
      md.add("");
      md.add("## Suspicious Modules");
      md.add("");
      md.add(
          "Module names listed in this section didn't make it into the `modules.properties` database.");
      md.add("");
      md.add("- Invalid module names: [" + suspiciousSyntax.size() + "](suspicious/syntax.md)");
      md.add(
          "- Naming is [_off_](http://blog.joda.org/2017/04/java-se-9-jpms-module-naming.html): ["
              + suspiciousNaming.size()
              + "](suspicious/naming.md)");
      md.add("- Modular impostors: [" + suspiciousImpostors.size() + "](suspicious/impostors.md)");
      md.add("");
      md.add("## Unique Modules (" + modules.size() + ")");
      md.add("");
      md.add("Module names listed in this section are unique and well-formed.");
      md.add("Include them in your `module-info.java` module descriptors.");
      md.add("");
      modules.values().stream().filter(Module::isExplicit).forEach(it -> md.add(it.toMarkdown()));
      return md;
    }

    void write() throws Exception {
      // to standard out...
      var summaryStrings = toStrings();
      summaryStrings.forEach(System.out::println);

      // generate commit message file...
      var commitMessage = new ArrayList<String>();
      commitMessage.add(modules.size() + " Java modules at Maven Central [skip ci]");
      commitMessage.add("");
      commitMessage.addAll(summaryStrings);
      Files.write(Path.of(".travis-commit-message.md"), commitMessage);

      // to markdown...
      Files.write(Path.of("README.md"), toMarkdown(summaryStrings));

      // to properties files...
      var nameToLineList = new ArrayList<String>();
      var nameToMavenList = new ArrayList<String>();
      var nameToVersionList = new ArrayList<String>();
      for (var item : modules.values()) {
        nameToLineList.add(item.moduleName + '=' + item.line);
        nameToMavenList.add(item.moduleName + '=' + item.mavenGroupColonArtifact);
        nameToVersionList.add(item.moduleName + '=' + item.mavenVersion);
      }
      Files.write(Path.of("modules.properties"), nameToLineList);
      Files.write(Path.of("module-maven.properties"), nameToMavenList);
      Files.write(Path.of("module-version.properties"), nameToVersionList);

      // to suspicious files...
      var suspicious = Path.of("suspicious");
      Files.createDirectories(suspicious);
      Files.write(
          suspicious.resolve("syntax.md"),
          suspiciousSyntax.stream()
              .sorted(comparing(Module::name))
              .map(it -> it.toMarkdown() + " // `" + it.line + "`")
              .collect(toList()));
      Files.write(
          suspicious.resolve("impostors.md"),
          suspiciousImpostors.stream()
              .sorted(comparing(Module::name))
              .map(it -> it.toMarkdown() + " // `" + it.line + "`")
              .collect(toList()));
      Files.write(
          suspicious.resolve("naming.md"),
          suspiciousNaming.stream()
              .sorted(comparing(Module::name))
              .map(it -> it.toMarkdown() + " // `" + it.line + "`")
              .collect(toList()));
    }
  }
}
