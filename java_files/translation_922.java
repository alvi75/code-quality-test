import java.util.*;

public class Translation922 {
    ublic static String join(ICollection<String> parts, String separator, String lastSeparator) {
    StringBuilder sb = new StringBuilder();
    int i = 0;
    int lastIndex = parts.Count() - 1;
    for (String part : parts) {
        sb.append(part);
        if (i == lastIndex) {
            sb.append(lastSeparator);
        }
        else {
            if (i != lastIndex) {
                sb.append(separator);
            }
            else {
                sb.append(lastSeparator);
            }
        }
    }
    return sb.toString();
}
}