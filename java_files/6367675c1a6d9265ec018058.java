import java.util.*;

public class Generated_6367675c1a6d9265ec018058 {
    /**Create a string supplier which returns unique integer strings starting from the given start.**/
@SuppressWarnings("unchecked")
    public static Supplier<String> createStringSupplier(int start){
        return new StringSupplier() {
            private int next = start;
            @Override
            public String get() {
                if (next < 0) {
                    return null;
                }
                final String s = String.valueOf(next);
                next++;
                return s;
            }
        };
    }
}