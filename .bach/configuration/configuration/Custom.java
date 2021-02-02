package configuration;

import com.github.sormuras.bach.Bach;
import com.github.sormuras.bach.Base;
import com.github.sormuras.bach.Command;
import com.github.sormuras.bach.Flag;
import java.nio.file.Files;

public class Custom extends Bach {

  public Custom() {
    super(Base.ofSystem(), System.out::println, Flag.VERBOSE);
  }

  @Override
  public void buildMainSpace() throws Exception {
    var module = "com.github.sormuras.modules";
    var moduleVersion = project().version();
    var javaRelease = 11;
    var destination = base().workspace("classes", "main", "" + javaRelease);
    var modules = base().workspace("modules");

    run(
        Command.javac()
            .add("--release", javaRelease)
            .add("--module", module)
            .add("--module-version", moduleVersion)
            .add("--module-source-path", ".")
            .add("--module-path", Bach.BIN)
            .add("-encoding", "UTF-8")
            .add("-d", destination));

    Files.createDirectories(modules);
    var file = modules.resolve(computeMainJarFileName(module));
    run(
        Command.jar()
            .add("--verbose")
            .add("--create")
            .add("--file", file)
            .add("--main-class", module + ".Main")
            .add("-C", destination.resolve(module), ".")
            .add("-C", module, "."));
  }
}
