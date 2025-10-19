import java.util.*;

public class Generated_6367676a1a6d9265ec0181cd {
    /**Trim the leading whitespaces in a string.**/
    public static String trimLeadingWhitespace(String str) {
        if (str == null || str.length() == 0) return str;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (!Character.isWhitespace(c)) break;
        }
        return str.substring(i, len);
    }
}