import java.util.*;

public class Generated_636767081a6d9265ec017989 {
    public static boolean[] toPrimitive(final Boolean[] array) {
        if (array == null) {
            return null;
        }
        final boolean[] result = new boolean[array.length];
        for (int i = 0; i < array.length; ++i) {
            result[i] = array[i].booleanValue();
        }
        return result;
    }
}