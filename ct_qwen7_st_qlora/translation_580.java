import java.util.*;

public class Translation580 {
    public static void register(String name, MergeStrategy impl) {
    STRATEGIES.put(name.toLowerCase(Locale.ROOT), impl);
}
}