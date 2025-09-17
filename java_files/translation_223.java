import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class Translationtranslation_223 {
    public char requireChar(Map<String,String> args, String name) {
        String s = args.remove(name);
        if (s == null) {
            throw new IllegalArgumentException("Configuration Error: missing parameter '" + name + "'");
        }
        args.remove("name");
        return s.charAt(0);
    }
}