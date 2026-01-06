import java.util.*;

public class Generated_636767081a6d9265ec017989 {
    public static boolean[] toPrimitive(final Boolean[] array) {
        if (array == null || array.length == 0)
            return EMPTY_BOOLEAN_ARRAY;
        final boolean[] result = new boolean[array.length];
        for (int i = 0; i < array.length; i++)
            result[i] = array[i].booleanValue();
        return result;
    }
}