import java.util.*;

public class Translationtranslation_592 {
    public static String join(Collection<String> parts, String separator) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0;
        i < parts.size();
        i++) {
            String part = parts.iterator().next();
            if (part.length() == 0)continue;
            if (i > 0) {
                sb.append(separator);
            }
            sb.append(part);
        }
        return sb.toString();
    }
}