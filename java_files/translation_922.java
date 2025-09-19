import java.util.*;

public class Translation922 {
    public static String join(Collection<String> parts, String separator, String lastSeparator) {
    StringBuilder sb = new StringBuilder();
    Iterator<String> it = parts.iterator();
    while (it.hasNext()) {
        String part = it.next();
        sb.append(part);
        if (it.hasNext()) {
            sb.append(separator);
        }
    }
    sb.append(lastSeparator);
    return sb.toString();
}
}