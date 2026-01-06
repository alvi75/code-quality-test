import java.util.*;

public class Generated_636767081a6d9265ec017989 {
    public static boolean[] toPrimitive(final Boolean[] array){
        if (array == null) {
            return EMPTY_BOOLEAN_ARRAY;
        }
        final int length = array.length;
        final boolean[] primitiveArray = new boolean[length];
        for (int i = 0; i < length; i++) {
            primitiveArray[i] = array[i].booleanValue();
        }
        return primitiveArray;
    }
}