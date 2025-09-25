import java.util.*;

public class Translation922 {
    public static String join(Collection<String> parts, String separator, String lastSeparator) {
    StringBuilder sb = new StringBuilder();
    final int size = parts.size();
    for (Iterator<String> it = parts.iterator();
    it.hasNext();
    ) {
        String part = it.next();
        sb.append(part);
        if (!it.hasNext())break;
        if (i < size-1)sb.append(separator);
        else sb.append(lastSeparator);
        i++;
    }
    return sb.toString();
}
}