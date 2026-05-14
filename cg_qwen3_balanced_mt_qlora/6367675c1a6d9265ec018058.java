import java.util.*;

public class Generated_6367675c1a6d9265ec018058 {
    /**Create a string supplier which returns unique integer strings starting from the given start.**/
    @SuppressWarnings("unchecked")
    public static Supplier<String> createStringSupplier(int start){
        return new Supplier<String>() {
            private int i = start;
            @Override
            public String get() {
                return "" + i++;
            }
        };
    }
}