package com.github.sormuras.modules;

import java.util.Properties;
import java.util.TreeMap;

class Main {

  public static void main(String... args) throws Exception {
    var modules = args.length > 0 ? scanModulesFromBucket(args[0]) : loadModulesFromProperties();
    modules.forEach((module, uri) -> System.out.printf("%s=%s%n", module, uri));
    System.out.printf("# %d module%s%n", modules.size(), modules.size() == 1 ? "" : "s");
  }

  static TreeMap<String, String> scanModulesFromBucket(String directory) throws Exception {
    return new Scanner(directory).scan().modules();
  }

  static TreeMap<String, String> loadModulesFromProperties() {
    var tree = new TreeMap<String, String>();
    var name = "/com/github/sormuras/modules/modules.properties";
    try (var stream = Main.class.getResourceAsStream(name)) {
      var properties = new Properties();
      properties.load(stream);
      properties.forEach((module, uri) -> tree.put(module.toString(), uri.toString()));
    } catch (Exception exception) {
      throw new Error(exception);
    }
    return tree;
  }

  private Main() {}
}
