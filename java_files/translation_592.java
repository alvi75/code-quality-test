import java.util.*;

public class Translation592 {
    public static String join(Collection<String> parts, String separator) {
    return Arrays.stream(parts).collect(Collectors.joining(separator));
}
}