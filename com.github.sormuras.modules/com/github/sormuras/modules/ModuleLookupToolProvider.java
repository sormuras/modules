package com.github.sormuras.modules;

import java.io.PrintWriter;
import java.util.Properties;
import java.util.spi.ToolProvider;

public class ModuleLookupToolProvider implements ToolProvider {

  private final Properties properties;

  public ModuleLookupToolProvider() {
    this.properties = loadProperties();
  }

  protected Properties loadProperties() {
    var name = "/com/github/sormuras/modules/modules.properties";
    try (var stream = getClass().getResourceAsStream(name)) {
      var properties = new Properties();
      properties.load(stream);
      return properties;
    } catch (Exception exception) {
      throw new Error(exception);
    }
  }

  @Override
  public String name() {
    return getClass().getName();
  }

  @Override
  public int run(PrintWriter out, PrintWriter err, String... args) {
    if (args.length == 0) {
      properties.stringPropertyNames().stream()
          .sorted()
          .forEach(module -> out.printf("%s=%s%n", module, properties.getProperty(module)));
      out.printf("%n# %d module%s%n", properties.size(), properties.size() == 1 ? "" : "s");
      return 0;
    }
    if (args.length == 1) {
      var uri = properties.getProperty(args[0]);
      if (uri != null) {
        out.println(uri);
        return 0;
      }
      return 1;
    }
    err.printf("Usage: %s [MODULE]%n", name());
    return 2;
  }
}
