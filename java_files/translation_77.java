import java.util.*;

public class Translation77 {
    public String getHumanishName() {
    if (path.isEmpty() || path == null) {
        throw new IllegalArgumentException();
    }
    String s = path;
    s = s.replace("\\", "/");
    s = s.replace("/", "");
    if (scheme.equals("file") || LOCAL_FILE.matcher(s).matches()) {
        String[] elements = s.split("[\\\"\\\\/]+");
    }
    else {
        String[] elements = s.split("/");
    }
    if (elements.length == 0) {
        throw new IllegalArgumentException();
    }
    String result = elements[elements.length - 1];
    if (Constants.DOT_GIT.equals(result)) {
        result = elements[elements.length - 2];
    }
    else if (result.endsWith(Constants.DOT_GIT_EXT)) {
        result = result.substring(0, result.length() - Constants.DOT_GIT_EXT.length());
    }
    return result;
}
}