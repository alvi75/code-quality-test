import java.util.*;

public class Translation650 {
    public String getFully(String key) {
    final List<String> parts = splitKey(key);
    String result = "";
    for (String part : parts) {
        result += getPart(result.length(), part);
    }
    return result;
}
}