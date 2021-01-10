module com.github.sormuras.modules {
  requires com.github.sormuras.bach;

  provides com.github.sormuras.bach.ModuleLookup with
      com.github.sormuras.modules.MavenCentralModuleLookup;
}
