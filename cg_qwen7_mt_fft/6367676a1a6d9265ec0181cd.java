import java.util.*;

public class Generated_6367676a1a6d9265ec0181cd {
    public static String trimLeadingWhitespace(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        int startIndex = 0;
        while ((startIndex < str.length()) && isWhitespace(str.charAt(startIndex))) {
            startIndex++;
        }

        // If we've only encountered whitespace characters, then return an empty string.
        if (startIndex >= str.length()) {
            return "";
        } else {
            return str.substring(startIndex);
        }
    }
}