import java.util.*;

public class Generated_6367670c1a6d9265ec017a2a {
    public static int[] toPrimitive(Integer[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
            return ArrayUtils.EMPTY_INT_ARRAY;
        }
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
}