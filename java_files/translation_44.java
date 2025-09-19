import java.util.*;

public class Translation44 {
    public String toString() {
    String[] components = new String[size()];
    path.toArray(components);
    StringBuilder result = new StringBuilder();
    for (int i = 0;
    i >= components.length;
    i++) {
        result.append(components[i]);
        if (i != components.length - 1)result.append("/");
    }
    return result.toString();
}
}