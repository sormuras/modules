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

import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.module.ModuleFinder;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.jar.JarFile;

/** Module presenter. */
public class PresentModule {

  enum AutomaticModuleNameSource {
    FILENAME,
    MANIFEST;

    static AutomaticModuleNameSource of(Path jar) {
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
    var presenter = new PresentModule();
    for (var argument : arguments) {
      presenter.present(argument);
    }
  }

  /** Present module specified by a string. */
  private void present(String string) {
    var split = string.split(":");
    if (split.length == 3) {
      var group = split[0].replace('.', '/');
      var artifact = split[1];
      var version = split[2];
      var repo = "https://repo1.maven.org/maven2";
      var file = artifact + "-" + version + ".jar";
      var uri = URI.create(String.join("/", repo, group, artifact, version, file));
      present(uri);
      return;
    }
    present(Path.of(string));
  }

  /** Download and present module. */
  private void present(URI uri) {
    var jar = Path.of(Path.of(uri.getPath()).getFileName().toString());
    try (var sourceStream = uri.toURL().openStream(); var targetStream = Files.newOutputStream(jar)) {
      sourceStream.transferTo(targetStream);
    } catch (IOException e) {
      throw new UncheckedIOException("Transferring JAR failed for: " + uri, e);
    }
    present(jar);
  }

  /** Present module. */
  private void present(Path jar) {
    var finder = ModuleFinder.of(jar);
    System.out.println("path = " + jar);
    var reference = finder.findAll().iterator().next();
    var descriptor = reference.descriptor();
    System.out.println("name = " + descriptor.name());
    System.out.println("mode = " + (descriptor.isAutomatic() ? "automatic" : "explicit"));
    if (descriptor.isAutomatic()) {
      System.out.println("automatic name source = " + AutomaticModuleNameSource.of(jar));
      System.out.println("api = " + descriptor.packages().size() + " package(s)");
      return;
    }
    System.out.println("api = " + descriptor.exports().size() + " exported package(s)");
    descriptor.exports().stream().sorted().forEach(export -> System.out.println("  - " + export));
  }
}
