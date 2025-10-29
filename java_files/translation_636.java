import java.util.*;

public class Translation636 {
    ublic static String quoteReplacement(String s) {
    StringBuilder result = new StringBuilder(s.length());
    for (int i = 0;
    i < s.length();
    i++) {
        char c = s.charAt(i);
        if (c == '\\') {
            result.append('\\');
        }
        else if (c == '$') {
            result.append('$');
        }
        else {
            result.append(c);
        }
    }
    return result.toString();
}
}