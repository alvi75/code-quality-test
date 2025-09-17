import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class Translationtranslation_223 {
    public char requireChar(Map<String,String> args, String name) {
        String s = args.remove(name);
        if (s == null) {
            throw new IllegalArgumentException("Configuration Error: missing parameter '" + name + "'");
        }
        else {
            if (s.length() != 1) {
                throw new IllegalArgumentException("Parameter '" + name + "' has invalid value '" + s + "': length is not 1");
            }
            return s.charAt(0);
        }
    }
}