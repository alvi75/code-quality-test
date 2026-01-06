import java.util.*;

public class Generated_636766fe1a6d9265ec017838 {
    /**Return a string which is consist of the values of elements in the given array.If array is equal to null,return null,or return ArrayUtils.EMPTY_CHAR_ARRAY if the size of array is equal to zero.*/
    public static char[] toPrimitive(final Character[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
            return ArrayUtils.EMPTY_CHAR_ARRAY;
        }

        final char[] result = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i].charValue();
        }
        return result;
    }
}