import java.util.*;

public class Translation223 {
    1 public char requireChar(Map<String,String> args, String name) {
    String s = require(args, name);
    if (s.length() != 1)throw new IllegalArgumentException(name + " must be one character");
    return s.charAt(0);
}
}