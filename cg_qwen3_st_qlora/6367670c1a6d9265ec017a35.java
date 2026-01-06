import java.util.*;

public class Generated_6367670c1a6d9265ec017a35 {
    /**
 * Determines whether a character string ends with a specified suffix.
 */
private static boolean endsWith(final String str, final String suffix,
                                  final boolean ignoreCase) {
        if (str == null || suffix == null) {
            return false;
        }
        if (suffix.length() > str.length()) {
            return false;
        }
        int suffixLength = suffix.length();
        int strLength = str.length();
        int index = strLength - suffixLength;
        if (index < 0) {
            return false;
        }
        if (ignoreCase) {
            for (int i = 0; i < suffixLength; i++) {
                char ch1 = str.charAt(index + i);
                char ch2 = suffix.charAt(i);
                if (Character.toUpperCase(ch1) != Character.toUpperCase(ch2)) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < suffixLength; i++) {
                if (str.charAt(index + i) != suffix.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}