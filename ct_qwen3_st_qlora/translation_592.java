import java.util.*;

public class Translation592 {
    ublic static String join(Collection<String> parts, String separator) {
    StringBuilder sb = new StringBuilder();
    for (String part : parts) {
        if (sb.length() > 0)sb.append(separator);
        sb.append(part);
    }
    return sb.toString();
}
}