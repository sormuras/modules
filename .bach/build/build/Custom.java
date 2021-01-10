package build;

import com.github.sormuras.bach.Bach;
import com.github.sormuras.bach.Base;
import com.github.sormuras.bach.Command;
import com.github.sormuras.bach.Flag;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.StringJoiner;

public class Custom extends Bach {

  private final String module = "com.github.sormuras.modules";

  public Custom() {
    super(Base.ofSystem(), System.out::println, Flag.VERBOSE);
  }

  @Override
  public void buildMainSpace() throws Exception {
    updateModuleProperties();
    compileAndPackageModule();
  }

  void updateModuleProperties() throws Exception {

    record Line(String G, String A, String V, String module, String version, String mode) {

      static Line of(String line) {
        var s = line.split(",");
        return new Line(s[0].split("=")[1], s[1], s[2], s[3], s[4], s[5]);
      }

      boolean isExplicit() {
        return "explicit".equals(mode);
      }

      public String toPropertyLine() {
        return module
            + '='
            + new StringJoiner("/")
                .add("https://repo.maven.apache.org/maven2")
                .add(G.replace('.', '/'))
                .add(A)
                .add(V)
                .add(A + '-' + V + ".jar");
      }
    }

    var lines = new ArrayList<String>();
    Files.lines(Path.of("modules.properties"))
        .map(Line::of)
        .filter(Line::isExplicit)
        .map(Line::toPropertyLine)
        .forEach(lines::add);
    Files.write(Path.of(module, module.replace('.', '/'), "modules.properties"), lines);
  }

  void compileAndPackageModule() throws Exception {
    var moduleVersion = project().version();
    var javaRelease = 16;
    var destination = base().workspace("classes", "main", "" + javaRelease);
    var modules = base().workspace("modules");

    run(
        Command.javac()
            .add("--release", javaRelease)
            .add("--module", module)
            .add("--module-version", moduleVersion)
            .add("--module-source-path", ".")
            .add("--module-path", Bach.CACHE)
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
