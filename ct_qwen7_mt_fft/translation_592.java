import java.util.*;

public class Translation592 {
    public static String join(Collection<String> parts, char separator) {
    StringBuilder r = new StringBuilder();
    foreach (String s in parts)r.append(s).append(separator);
    if (r.length() > 0)r.setCharAt(r.length() - 1, separator);
    return r.toString();
}
}