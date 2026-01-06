import java.util.*;

public class Generated_6367675c1a6d9265ec018058 {
    @SuppressWarnings("unchecked")
    public static Supplier<String> createStringSupplier(int start){
        return () -> {
            int i = start;
            while (true) {
                String s = "s" + i;
                if (!Strings.contains(STRING_SUPPLIERS, s)) {
                    STRING_SUPPLIERS.add(s);
                    return s;
                }
                ++i;
            }
        };
    }
}