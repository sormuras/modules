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

// default package

import static java.util.stream.Collectors.joining;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UncheckedIOException;
import java.lang.module.ModuleDescriptor;
import java.lang.module.ModuleFinder;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.jar.JarFile;

/** Printer module information in JSON format. */
public class ModulesToJson {

  enum NameSource {
    FILENAME,
    MANIFEST,
    DESCRIPTOR;

    static NameSource of(ModuleDescriptor descriptor, Path jar) {
      if (!descriptor.isAutomatic()) {
        return DESCRIPTOR;
      }
      try (var jarFile = new JarFile(jar.toFile())) {
        var name = jarFile.getManifest().getMainAttributes().getValue("Automatic-Module-Name");
        if (name != null) {
          return MANIFEST;
        }
      } catch (IOException e) {
        throw new UncheckedIOException("Opening JAR failed: " + jar, e);
      }
      return FILENAME;
    }
  }

  public static void main(String[] arguments) {
    if (arguments.length == 0) {
      System.out.println("Usage: java ModulesToJson <JAR|GAV...>");
      System.out.println("       JAR = path to local JAR file");
      System.out.println("       GAV = Maven Central coordinates");
      System.out.println("java ModulesToJson.java path/to/.../junit-platform-commons-1.5.0.jar");
      System.out.println("java ModulesToJson.java junit:junit:4.12 junit:junit:4.13-beta-3");
      return;
    }
    var writer = new PrintWriter(System.out, false);
    var printer = new ModulesToJson(writer);
    writer.println("{");
    writer.println("  \"modules\": [");
    var firstModule = true;
    for (var argument : arguments) {
      if (!firstModule) {
        writer.println("  ,");
      }
      firstModule = false;
      printer.print(argument);
      writer.flush();
    }
    writer.println("  ]"); // modules
    writer.println("}");
    writer.flush();
  }

  private final PrintWriter writer;

  private ModulesToJson(PrintWriter writer) {
    this.writer = writer;
  }

  /** Present module specified by a string. */
  private void print(String string) {
    var split = string.split(":");
    if (split.length == 3) {
      var group = split[0].replace('.', '/');
      var artifact = split[1];
      var version = split[2];
      var repo = "https://repo1.maven.org/maven2";
      var file = artifact + "-" + version + ".jar";
      var uri = URI.create(String.join("/", repo, group, artifact, version, file));
      printUri(uri);
      return;
    }
    printJar(Path.of(string));
  }

  /** Download and present module. */
  private void printUri(URI uri) {
    var jar = Path.of(Path.of(uri.getPath()).getFileName().toString());
    try (var sourceStream = uri.toURL().openStream();
        var targetStream = Files.newOutputStream(jar)) {
      sourceStream.transferTo(targetStream);
    } catch (IOException e) {
      throw new UncheckedIOException("Transferring JAR failed for: " + uri, e);
    }
    printJar(jar);
  }

  /** Present module. */
  private void printJar(Path jar) {
    var finder = ModuleFinder.of(jar);
    var reference = finder.findAll().iterator().next();
    var descriptor = reference.descriptor();
    writer.printf("    {%n");
    writer.printf("      \"path\": \"%s\",%n", jar.toUri());
    writer.printf("      \"name\": \"%s\",%n", descriptor.name());
    writer.printf("      \"nameSource\": \"%s\",%n", NameSource.of(descriptor, jar));
    writer.printf("      \"packages\": %d%n", descriptor.packages().size());
    if (descriptor.isAutomatic()) {
      writer.printf("      \"mode\": \"automatic\",%n");
    } else {
      writer.printf("      \"mode\": \"explicit\",%n");
      printSortedSet("exports", descriptor.exports());
      printSortedSet("provides", descriptor.provides());
    }
    writer.printf("    }%n");
  }

  private void printSortedSet(String name, Set<?> set) {
    writer.printf("      \"%s\": [", name);
    if (set.isEmpty()) {
      writer.println("]");
      return;
    }
    var value = set.stream().sorted().map(e -> toSetEntryString(name, e)).collect(joining(",\n"));
    writer.printf("%n%s%n", value);
    writer.printf("      ]%n");
  }

  private String toSetEntryString(String name, Object entry) {
    return String.format("        { \"%s\": \"%s\" }", name, entry);
  }
}
