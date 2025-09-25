import java.util.*;

public class Translation592 {
    public static String join(Collection<String> parts, String separator) {
    StringBuilder sb = new StringBuilder();
    for (Iterator<String> i = parts.iterator();
    i.hasNext();
    ) {
        if (sb.length() > 0) {
            sb.append(separator);
        }
        sb.append(i.next());
    }
    return sb.toString();
}
}