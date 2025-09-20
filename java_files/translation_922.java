import java.util.*;

public class Translation922 {
    public static String join(Collection<String> parts, String separator) {
    StringBuilder sb = new StringBuilder();
    boolean first = true;
    for (String part : parts) {
        if (!first) {
            sb.append(separator);
        }
        else {
            first = false;
        }
        sb.append(part);
    }
    return sb.toString();
}
}