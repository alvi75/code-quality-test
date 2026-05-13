import java.util.*;

public class Translation139 {
    1 public static TokenFilterFactory forName(String name, Map<String,String> args) throws IOException {
    2 return loader.newInstance(name, args);
}
}