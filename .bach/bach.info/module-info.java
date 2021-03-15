import com.github.sormuras.bach.ProjectInfo;
import com.github.sormuras.bach.ProjectInfo.Tools;
import com.github.sormuras.bach.project.JavaStyle;

@ProjectInfo(
    version = "0-ea",
    format = JavaStyle.GOOGLE,
    tools = @Tools(limit = {"javac", "jar"}),
    compileModulesForJavaRelease = 11,
    includeSourceFilesIntoModules = true)
module bach.info {
  requires com.github.sormuras.bach;
}
