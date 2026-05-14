import java.util.*;

public class Generated_6367670c1a6d9265ec017a35 {
    private static boolean endsWith(final String str,
                                    final String suffix,
                                    final boolean ignoreCase) {
        if (str == null || suffix == null) {
            return false;
        }
        int len = suffix.length();
        int strLen = str.length();

        // Optimization: If the suffix's length is greater than the string's length, then it cannot be a substring.
        if (len > strLen) {
            return false;
        }

        if (ignoreCase) {
            for (int i = 1; i <= len; i++) {
                char c1 = str.charAt(strLen - i);
                char c2 = suffix.charAt(len - i);

                if (!Character.equalsIgnoreCase(c1, c2)) {
                    return false;
                }
            }
        } else {
            for (int i = 1; i <= len; i++) {
                if (str.charAt(strLen - i) != suffix.charAt(len - i)) {
                    return false;
                }
            }
        }

        return true;
    }
}