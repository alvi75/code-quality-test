import java.util.*;

public class Translationtranslation_592 {
    public static String join(Collection<String> parts, String separator) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = parts.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s == null)s = "null";
            sb.append(s);
            if (it.hasNext())sb.append(separator);
        }
        return sb.toString();
    }
}