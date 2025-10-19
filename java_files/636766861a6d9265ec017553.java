import java.util.*;

public class Generated_636766861a6d9265ec017553 {
    public final boolean isTemplateVariablePresent(String name) {
    for (TemplateParameter param : getParameters()) {
      if (param.getName().equals(name)) {
        return true;
      }
    }
    return false;
  }
}