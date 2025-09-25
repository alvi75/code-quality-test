import java.util.*;

public class Translation619 {
    public final ParserExtension getExtension(String key) {
    if (key == null || !extensions.containsKey(key)) return null;
    ParserExtension value = extensions.get(key);
    return value;
}
}