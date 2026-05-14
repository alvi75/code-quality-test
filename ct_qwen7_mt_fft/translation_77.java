import java.util.*;

public class Translation77 {
    public String getHumanishName() {
    if (getPath().isEmpty() || getPath() == null)throw new IllegalArgumentException();
    String s = getPath();
    final char separator = File.pathSeparatorChar;
    String[] elements = s.split(Pattern.quote(String.valueOf(separator)));
    if (elements.length == 0)throw new IllegalArgumentException();
    String result = elements[elements.length - 1];
    if (DOT_GIT.equals(result)) {
        result = elements[elements.length - 2];
    }
    else if (result.endsWith(DOT_GIT_EXT)) {
        result = result.substring(0,result.length()-DOT_GIT_EXT.length());
    }
    return result;
}
}