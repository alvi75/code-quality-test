import java.util.*;

public class Translation619 {
    public ParserExtension getExtension(String key) {
    if (key == null || !this.extensions.containsKey(key)) return null;
    return extensions.get(key);
}
}