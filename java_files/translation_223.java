import java.util.*;

public class Translation223 {
    public char requireChar(Map<String,String> args = new HashMap<>();
String sval = props.remove(name);
if (sval == null) {
    throw new IllegalArgumentException("Configuration Error: missing parameter '" + name + "'");
}
props.put(name, sval);
return sval.charAt(0);
}
}