import java.util.*;

public class Generated_636766fc1a6d9265ec0177ef {
    static String[] toNoNullStringArray(Object[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("The array must contain at least one element");
        }
        String[] result = new String[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            Object value = array[i];
            if (value != null) {
                result[j++] = value.toString();
            }
        }
        return Arrays.copyOf(result, j);
    }
}