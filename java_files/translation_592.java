import java.util.*;

public class Translation592 {
    public static String join(Collection<String> parts, String separator) {
    StringBuilder result = new StringBuilder();
    if (parts != null && !parts.isEmpty()) {
        Iterator<String> it = parts.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (result.length() > 0) {
                result.append(separator);
            }
            result.append(s);
        }
    }
    return result.toString();
}
}