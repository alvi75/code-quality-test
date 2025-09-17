import java.util.*;

public class Translationtranslation_922 {
    public static String join(Collection<String> parts, String separator, String lastSeparator) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int lastIndex = parts.size() - 1;
        for (String part : parts) {
            sb.append(part);
            if (i == lastIndex - 1 && !lastSeparator.isEmpty()) {
                sb.append(lastSeparator);
            }
            i++;
        }
        return sb.toString();
    }
}