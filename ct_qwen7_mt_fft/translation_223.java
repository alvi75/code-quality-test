import java.util.*;

public class Translation223 {
    public char requireChar(Map<String,String> args, String name) {
    char v = get(args,name);
    if (v == UNDEFINED)throw new IllegalArgumentException("argument "+name+" is required!");
    return v;
}
}