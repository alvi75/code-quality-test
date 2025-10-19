import java.util.*;

public class Generated_6367675c1a6d9265ec018058 {
    @SuppressWarnings("unchecked")
    public static Supplier<String> createStringSupplier(int start) {
        return new Supplier<String>() {

            private final AtomicInteger counter = new AtomicInteger(start);

            @Override
            public String get() {
                return Integer.toString(counter.getAndIncrement());
            }
        };
    }
}