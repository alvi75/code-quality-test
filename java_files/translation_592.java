import java.util.*;

public class Translation592 {
    ublic static String join(Collection<String> parts, String separator) {
    StringBuilder sb = new StringBuilder();
    Iterator<String> it = parts.iterator();
    while (it.hasNext()) {
        String s = it.next();
        sb.append(s);
        if (it.hasNext()) {
            sb.append(separator);
        }
    }
    return sb.toString();
}
}