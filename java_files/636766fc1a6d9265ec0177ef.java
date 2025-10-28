import java.util.*;

public class Generated_636766fc1a6d9265ec0177ef {
    static String[] toNoNullStringArray(Object[] array) {
        if (array == null || array.length == 0)
            throw new IllegalArgumentException("The input array can't be null or empty");
        int len = array.length;
        for (int i = 0; i < len; i++) {
            Object obj = array[i];
            if (obj != null && !(obj instanceof String)) {
                throw new IllegalArgumentException("The element in the array must be string type.");
            }
        }

        return Arrays.copyOf(array, len);
    }
}