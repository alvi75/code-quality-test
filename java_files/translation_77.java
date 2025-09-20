import java.util.*;

public class Translation77 {
    public String getHumanishName() throws IOException {
    String path = getPath();
    if (path.isEmpty() || path == null) {
        throw new IllegalArgumentException();
    }
    String[] elements;
    if ("file".equals(scheme) || LOCAL_FILE.matcher(path).matches()) {
        elements = path.split("[\\" + File.pathSeparator + "/]");
    }
    else {
        elements = path.split(File.pathSeparator);
    }
    if (elements.length == 0) {
        throw new IllegalArgumentException();
    }
    String result = elements[elements.length - 1];
    if (Constants.DOT_GIT.equals(result)) {
        result = elements[elements.length - 2];
    }
    else if (result.endsWith(Constants.DOT_GIT_EXT)) {
        result = result.substring(0, result.length()-Constants.DOT_GIT_EXT.length());
    }
    return result;
}
}