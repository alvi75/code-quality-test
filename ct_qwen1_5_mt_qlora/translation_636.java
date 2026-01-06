import java.util.*;

public class Translation636 {
    public static String quoteReplacement(String s) {
    StringBuilder result = new StringBuilder(s.length());
    for (int i = 0;
    i < s.length();
    i++) {
        char c = s.charAt(i);
        if (c == '\\' || c == '$') {
            result.append('\\');
        }
        result.append(c);
    }
    return result.toString();
}
}