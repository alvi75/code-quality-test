import java.util.*;

public class Generated_6367674f1a6d9265ec017e74 {
    /**
 * Convert a value in a vs array to a string
 */
public String toString(){
        if (value == null) return "null";
        if (value instanceof String) return "\"" + value + "\"";
        if (value instanceof Number) return value.toString();
        if (value instanceof Boolean) return value.toString();
        if (value instanceof Date) return ((Date)value).toString();
        if (value instanceof Object[]) return Arrays.toString((Object[])value);
        if (value instanceof List) return Arrays.toString(((List)value).toArray());
        if (value instanceof Map) return Arrays.toString(((Map)value).entrySet().toArray());
        return value.toString();
    }
}