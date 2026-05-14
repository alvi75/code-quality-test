import java.util.*;

public class Generated_636766861a6d9265ec017553 {
    public final boolean isTemplateVariablePresent(String name) {
    TemplateNode node = rootNode;
    while (node != null) {
      for (String var : node.getVarNames()) {
        if (var.equals(name)) {
          return true;
        }
      }
      node = node.getParent();
    }

    return false;
  }
}