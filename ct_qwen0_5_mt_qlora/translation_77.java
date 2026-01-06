import java.util.*;

public class Translation77 {
    public String getHumanishName() {
    if (getScheme() == null || getScheme().equals("")) {
        throw new IllegalArgumentException();
    }
    String path = getPath();
    String[] elements;
    if ("file".equals(getScheme())) {
        elements = path.split("[\\" + FilePath.separatorChar + "/]");
    }
    else {
        elements = path.split("/");
    }
    if (elements.length == 0) {
        throw new IllegalArgumentException();
    }
    String result = elements[elements.length - 1];
    if (Constants.DOT_GIT.equals(result)) {
        result = elements[elements.length - 2];
    }
    else {
        if (result.endsWith(Constants.DOT_GIT_EXT)) {
            result = Sharpen.Runtime.substring(result, 0, result.length() - Constants.DOT_GIT_EXT.length());
        }
    }
    return result;
}
}