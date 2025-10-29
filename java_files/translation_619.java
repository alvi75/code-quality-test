import java.util.*;

public class Translation619 {
    ublic ParserExtension getExtension(String key) {
    if (key == null || !extensions.containsKey(key)) {
        return null;
    }
    return extensions.get(key);
}
}