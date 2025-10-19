import java.util.*;

public class Generated_636767041a6d9265ec017911 {
    static void register(Object value){
        if(value == null) return;
        if(!REGISTRY.containsKey(value)){
            REGISTRY.put(value, new ValueWrapper(value));
        }
    }
}