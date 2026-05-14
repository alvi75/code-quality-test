import java.util.*;

public class Generated_636767151a6d9265ec017b6b {
    private static boolean startsWith(final String str,
                                     final String prefix,
                                     final boolean ignoreCase) {
        // NOPMD it's just plain stupid to use regex for this simple task.
        if (str == null || prefix == null) {
            return false;
        }
        int len = prefix.length();
        if (ignoreCase && !prefix.regionMatches(0, str, 0, len)) {
            return false;
        } else if (!ignoreCase && !prefix.equals(str.substring(0, len))) {
            return false;
        }
        return true;
    }
}