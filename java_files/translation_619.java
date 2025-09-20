import java.util.*;

public class Translation619 {
    public ParserExtension getExtension(String key) {
    ParserExtension result = extensions.get(key);
    if (result == null) {
        result = parser.getExtension(key);
    }
    return result;
}
}