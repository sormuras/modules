package bach.info;

import com.github.sormuras.bach.Bach;
import com.github.sormuras.bach.Command;
import com.github.sormuras.bach.Options;
import java.nio.file.Files;

public class Builder extends Bach {
  public static Provider<Builder> provider() {
    return Builder::new;
  }

  private Builder(Options options) {
    super(options);
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
