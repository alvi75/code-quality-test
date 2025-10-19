import java.util.*;

public class Generated_6367670c1a6d9265ec017a2a {
    public static int[] toPrimitive(final Integer[] array) {
        if (array == null || array.length == 0) {
            return EMPTY_INT_ARRAY;
        }
        final int[] res = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            res[i] = array[i].intValue();
        }
        return res;
    }
}