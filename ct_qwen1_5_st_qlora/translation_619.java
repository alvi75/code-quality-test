import java.util.*;

public class Translation619 {
    public final ParserExtension getExtension(String key) {
    ParserExtension value = this.extensions.get(key);
    return value != null ? value : EMPTY;
}
}