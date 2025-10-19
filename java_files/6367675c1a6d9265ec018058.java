import java.util.*;

public class Generated_6367675c1a6d9265ec018058 {
    @SuppressWarnings("unchecked")
    public static Supplier<String> createStringSupplier(int start){
        return new StringSupplier() {
            private int i = start;

            @Override
            public String getAsObject() {
                if (i == start) {
                    return "";
                } else {
                    ++i;
                    return Integer.toString(i);
                }
            }
        };
    }
}