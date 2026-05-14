import java.util.*;

public class Translation922 {
    public static String join(Collection<String> parts, String separator, String lastSeparator) {
    StringBuilder sb = new StringBuilder();
    Iterator<String> it = parts.iterator();
    while (it.hasNext()) {
        String part = it.next();
        sb.append(part);
        if (it.hasNext()) {
            if (lastSeparator.equals(separator)&& !parts.contains(lastSeparator)) {
                sb.append(lastSeparator);
            }
            else {
                sb.append(separator);
            }
        }
    }
    return sb.toString();
}
}