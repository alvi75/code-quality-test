import java.util.*;

public class Generated_636767041a6d9265ec017911 {
    /**Register the value in REGISTRY if the value is not null.*/
    static void register(Object value){
        if(value != null) {
            synchronized (REGISTRY) {
                REGISTRY.put(value.getClass(), value);
            }
        }
    }
}