import java.util.*;

public class Generated_636767151a6d9265ec017b6b {
    /**
 * Return true if the given string has the specified prefix with optional cases which can be ignored,or both string and prefix are null.Otherwise return false.
 */
private static boolean startsWith(final String str,final String prefix,final boolean ignoreCase){
        if(str == null || prefix == null) {
            return str == prefix;
        }
        if(ignoreCase) {
            return str.toLowerCase().startsWith(prefix.toLowerCase());
        } else {
            return str.startsWith(prefix);
        }
    }
}