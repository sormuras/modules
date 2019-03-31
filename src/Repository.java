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

import java.lang.module.ModuleFinder;
import java.lang.module.ModuleReference;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Repository {

  private static final Path HOME = Path.of(System.getProperty("user.home"));

  public static void main(String... args) throws Exception {
    var repository = new Repository(HOME.resolve(".java/modules"));
    // repository.putAll(HOME.resolve(".m2/repository"));
    System.out.println();
    repository.references.forEach((key, value) -> System.out.println("  " + key + " -> " + value + " + " + value.descriptor()));
    System.out.println();
    System.out.println(repository.get("org.objectweb.asm", "7.0.0"));
  }

  private final Path root;
  private final Map<String, ModuleReference> references;

  Repository(Path root) {
    this.root = root;
    this.references = new HashMap<>();
    try (var stream = Files.walk(root)) {
      stream
          .filter(path -> path.getFileName().toString().endsWith(".jar"))
          .map(Repository::test)
          .filter(Optional::isPresent)
          .map(Optional::get)
          .forEach(it -> references.put(it.descriptor().toNameAndVersion(), it));
    } catch (Exception e) {
      throw new Error("Creating module reference map failed!", e);
    }
  }

  Path get(String name, String version) {
    var base = root.resolve(name.replace('.', '/'));
    return base.resolve(name + "@" + version + ".jar");
  }

  Path put(Path path) {
    var reference = test(path);
    if (reference.isEmpty()) {
      throw new IllegalArgumentException("Not a well-formed Java module: " + path);
    }
    return put(reference.get());
  }

  Path put(ModuleReference reference) {
    var descriptor = reference.descriptor();
    var name = descriptor.name();
    var version = descriptor.version().orElseThrow().toString();
    var target = get(name, version);
    if (Files.exists(target)) {
      return target;
    }
    var source = Path.of(reference.location().orElseThrow());
    try {
      Files.createDirectories(target.getParent());
      return Files.copy(source, target);
    } catch (Exception e) {
      throw new Error(String.format("Storing %s to %s failed", source, target), e);
    }
  }

  void putAll(Path root) throws Exception {
    try (var stream = Files.walk(root)) {
      stream
          .filter(path -> path.getFileName().toString().endsWith(".jar"))
          .map(Repository::test)
          .filter(Optional::isPresent)
          .map(Optional::get)
          .peek(it -> System.out.println(it + " -> " + it.descriptor()))
          .forEach(this::put);
    }
  }

  public static Optional<ModuleReference> test(Path path) {
    if (Files.notExists(path)) {
      return Optional.empty();
    }
    ModuleReference reference;
    try {
      var references = ModuleFinder.of(path).findAll();
      if (references.size() != 1) {
        return Optional.empty();
      }
      reference = references.iterator().next();
    } catch (Exception e) {
      return Optional.empty();
    }
    var descriptor = reference.descriptor();
    if (descriptor.isAutomatic()) {
      return Optional.empty();
    }
    var name = descriptor.name();
    if (name.indexOf('.') < 0) {
      return Optional.empty();
    }
    var version = descriptor.version();
    if (version.isEmpty()) {
      return Optional.empty();
    }
    if (!descriptor.packages().stream().allMatch(packageName -> packageName.startsWith(name))) {
      return Optional.empty();
    }
    return Optional.of(reference);
  }
}
