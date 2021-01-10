package com.github.sormuras.modules;

import com.github.sormuras.bach.ModuleLookup;
import java.util.Optional;
import java.util.TreeMap;

public class MavenCentralModuleLookup implements ModuleLookup {

  private final TreeMap<String, String> modules;

  public MavenCentralModuleLookup() {
    this.modules = Main.loadModulesFromProperties();
  }

  @Override
  public Optional<String> lookupModule(String module) {
    return Optional.ofNullable(modules.get(module));
  }
}
