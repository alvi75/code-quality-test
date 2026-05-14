import java.util.*;

public class Translation619 {
    1 public ParserExtension getExtension(String key) {
    2 if (key == null || !extensions.containsKey(key))3 return null;
    4 return extensions.get(key);
    5 }
}