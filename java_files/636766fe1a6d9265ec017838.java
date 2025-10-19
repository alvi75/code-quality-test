import java.util.*;

public class Generated_636766fe1a6d9265ec017838 {
    public static char[] toPrimitive(final Character[] array){
        if(array == null || array.length == 0) {
            return EMPTY_CHAR_ARRAY;
        } else {
            final char[] chars = new char[array.length];
            for (int i = 0; i < array.length; i++) {
                chars[i] = array[i];
            }
            return chars;
        }
    }
}