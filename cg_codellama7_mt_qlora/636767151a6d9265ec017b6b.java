import java.util.*;

public class Generated_636767151a6d9265ec017b6b {
    public static boolean startsWith(String str, String prefix, boolean ignoreCase) {
        if (str == null || prefix == null) {
            return str == null && prefix == null;
        }
        if (ignoreCase) {
            return str.toLowerCase().startsWith(prefix.toLowerCase());
        }
        return str.startsWith(prefix);
    }
}