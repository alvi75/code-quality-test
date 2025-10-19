import java.util.*;

public class Generated_636766fc1a6d9265ec0177ef {
    static String[] toNoNullStringArray(Object[] array){
        if(array == null || array.length == 0) {
            throw new IllegalArgumentException("array must not be null or empty");
        }
        return Arrays.stream(array).filter(Objects::nonNull).toArray(String[]::new);
    }
}