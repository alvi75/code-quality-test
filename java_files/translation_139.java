import java.util.*;

public class Translation139 {
    public static TokenFilterFactory forName(String name, Map<String,String> args) {
    return loader.newInstance(name, args);
}
}