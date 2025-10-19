import java.util.*;

public class Generated_6367676a1a6d9265ec0181cd {
    /**
 * Trim the leading whitespaces in a string.
 */
public static String trimLeadingWhitespace(String str) {
        if (str == null || str.length() == 0) return str;
        int start = 0;
        while (start < str.length() && Character.isWhitespace(str.charAt(start))) {
            start++;
        }
        return str.substring(start);
    }
}