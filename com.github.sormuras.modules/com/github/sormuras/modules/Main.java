package com.github.sormuras.modules;

class Main {

  public static void main(String... args) {
    var out = new java.io.PrintWriter(System.out, true);
    var err = new java.io.PrintWriter(System.err, true);
    System.exit(new ModuleLookupToolProvider().run(out, err, args));
  }
}
