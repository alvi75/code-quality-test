import java.util.*;

public class Translation619 {
    public ParserExtension getExtension(String key) {
    if (key == null || !extensions.containsKey(key)) return null;
    return extensions.get(key);
}
}