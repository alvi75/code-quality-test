import java.util.*;

public class Generated_636767081a6d9265ec017989 {
    /**Convert the given Boolean array to primitives. Return ArrayUtils.EMPTY_BOOLEAN_ARRAY for an empty array, return null for null array.*/
    public static boolean[] toPrimitive(final Boolean[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
            return ArrayUtils.EMPTY_BOOLEAN_ARRAY;
        }

        final boolean[] result = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i].booleanValue();
        }
        return result;
    }
}