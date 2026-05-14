import java.util.*;

public class Generated_6367670c1a6d9265ec017a35 {
    /**Determines whether a character string ends with a specified suffix.**/
    private static boolean endsWith(final String str,
                                    final String suffix,
                                    final boolean ignoreCase) {
        if (str == null || suffix == null) {
            return false;
        }
        int len = suffix.length();
        int diff = str.length() - len;
        if (diff < 0) {
            return false;
        }
        if (ignoreCase) {
            for (int i = 1; i <= len; i++) {
                char c1 = str.charAt(diff + i);
                char c2 = suffix.charAt(i);
                if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                    return false;
                }
            }
        } else {
            for (int i = 1; i <= len; i++) {
                if (str.charAt(diff + i) != suffix.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}