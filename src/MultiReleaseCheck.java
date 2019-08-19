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

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UncheckedIOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

/** Check multi-release JAR. */
public class MultiReleaseCheck {

  public static void main(String[] arguments) {
    if (arguments.length != 1) {
      System.out.println("Usage: java MultiReleaseCheck.java <JAR|GAV>");
      System.out.println("       JAR = path to local JAR file");
      System.out.println("       GAV = Maven Central coordinates");
      System.out.println("java MultiReleaseCheck.java path/to/.../lwjgl-3.2.2.jar");
      System.out.println("java MultiReleaseCheck.java org.junit.platform:junit-platform-commons:1.1.0");
      return;
    }
    var writer = new PrintWriter(System.out, false);
    var status = new MultiReleaseCheck(writer).check(arguments[0]);
    writer.flush();
    if (status != 0) {
      System.exit(status);
    }
  }

  private final PrintWriter writer;

  private MultiReleaseCheck(PrintWriter writer) {
    this.writer = writer;
  }

  private int check(String string) {
    var split = string.split(":");
    if (split.length == 3) {
      var group = split[0].replace('.', '/');
      var artifact = split[1];
      var version = split[2];
      var repo = "https://repo1.maven.org/maven2";
      var file = artifact + "-" + version + ".jar";
      var uri = URI.create(String.join("/", repo, group, artifact, version, file));
      return checkUri(uri);
    }
    return checkJar(Path.of(string));
  }

  private int checkUri(URI uri) {
    var jar = Path.of(Path.of(uri.getPath()).getFileName().toString());
    try (var sourceStream = uri.toURL().openStream();
        var targetStream = Files.newOutputStream(jar)) {
      sourceStream.transferTo(targetStream);
    } catch (IOException e) {
      throw new UncheckedIOException("Transferring JAR failed for: " + uri, e);
    }
    return checkJar(jar);
  }

  private int checkJar(Path jar) {
    if (!Files.isRegularFile(jar)) {
      throw new IllegalArgumentException("path doesn't point to a regular file: " + jar);
    }
    try (var jarFile = new JarFile(jar.toFile())) {
      if (!jarFile.isMultiRelease()) {
        writer.printf("File %s isn't a multi-release JAR file.%n", jar);
        return 0;
      }
      return jarFile.stream()
          .filter(e -> !e.isDirectory())
          .map(ZipEntry::getName)
          .filter(n -> n.startsWith("META-INF/versions/"))
          .mapToInt(n -> checkJarEntry(jarFile, n))
          .sum();
    } catch (IOException e) {
      throw new UncheckedIOException("Opening JAR failed: " + jar, e);
    }
  }

  private int checkJarEntry(JarFile jarFile, String name) {
    int expected = Integer.parseInt(name.substring(18, name.indexOf('/', 18)));
    try (var stream = new DataInputStream(jarFile.getInputStream(jarFile.getEntry(name)))) {
      stream.skipBytes(4 + 2); // magic (4) + minor_version (2)
      int version = stream.readUnsignedShort(); // major_version (2)
      int actual = version - 44;
      if (actual > expected) {
        writer.printf("Expected %d, but '%s' reports: %d (%d)%n", expected, name, actual, version);
        return 1;
      }
    } catch (IOException e) {
      throw new UncheckedIOException("Reading JAR file entry failed: " + jarFile, e);
    }
    return 0;
  }
}
