import java.util.*;

public class Translation922 {
    public static String join(Collection<String> parts, char separator) {
    StringBuilder builder = new StringBuilder();
    for (String str : parts) {
        builder.append(str).append(separator);
    }
    char lastChar = separator;
    if (parts.size() > 0 && !parts.isEmpty()) {
        lastChar = Character.toUpperCase(parts.get(parts.size() - 1).charAt(0));
    }
    return builder.deleteCharAt(builder.length() - 1).toString();
}
}