import java.util.*;

public class Translation223 {
    public char requireChar(Map<String,String> args, String name) {
    Character result = get(args, name);
    if (result == null)throw new IllegalArgumentException("Missing parameter '" + name + "'");
    return result.charValue();
}
}