import java.util.*;

public class Generated_636766fe1a6d9265ec017838 {
    /**Return a string which is consist of the values of elements in the given array.If array is equal to null,return null,or return ArrayUtils.EMPTY_CHAR_ARRAY if the size of array is equal to zero.**/ 
    public static char[] toPrimitive(final Character[] array){
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return EMPTY_CHAR_ARRAY;
        } else {
            final char[] chars = new char[array.length];
            for (int i = 0; i < array.length; i++) {
                chars[i] = array[i].charValue();
            }
            return chars;
        }
    }
}