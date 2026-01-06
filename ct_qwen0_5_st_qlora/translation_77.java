import java.util.*;

public class Translation77 {
    public String getHumanishName() {
    if (getPath() == null || getPath().length() == 0) {
        throw new IllegalArgumentException();
    }
    String s = getPath();
    String[] elements;
    if ("file".equals(getScheme()) || LOCAL_FILE.matcher(s).matches()) {
        elements = s.split("\\[" + FilePath.separatorChar + "/\\]");
    }
    else {
        elements = s.split("/");
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
            result = result.substring(0, result.length() - Constants.DOT_GIT_EXT.length());
        }
    }
    return result;
}
}