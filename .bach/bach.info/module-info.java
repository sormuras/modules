import com.github.sormuras.bach.ProjectInfo;
import com.github.sormuras.bach.project.JavaStyle;

@ProjectInfo(version = "0-ea", format = JavaStyle.GOOGLE)
module bach.info {
  requires com.github.sormuras.bach;
  provides com.github.sormuras.bach.Bach.Provider with bach.info.Builder;
}
