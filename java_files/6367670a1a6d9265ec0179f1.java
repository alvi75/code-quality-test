import java.util.*;

public class Generated_6367670a1a6d9265ec0179f1 {
    /**
     * Convert an array of primitive shorts to objects.
     */
    public static Short[] toObject(final short[] array) {
        final int length = array.length;
        if (length == 0)
            return EMPTY_SHORT_ARRAY;

        final Short[] result = new Short[length];
        for (int i = 0; i < length; ++i)
            result[i] = Short.valueOf(array[i]);
        return result;
    }
}