import java.util.*;

public class Generated_636767151a6d9265ec017b6b {
    private static boolean startsWith(final String str,final String prefix,final boolean ignoreCase) {
        if (str == null || prefix == null) {
            return false;
        }
        if (prefix.length() > str.length()) {
            return false;
        }
        final int len = prefix.length();
        final int pos = str.indexOf(prefix);
        if (pos >= 0) {
            if (ignoreCase) {
                return str.substring(pos).equalsIgnoreCase(prefix);
            } else {
                return str.substring(pos).equals(prefix);
            }
        }
        return false;
    }
}