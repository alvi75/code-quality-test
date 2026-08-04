import java.util.*;

public class Generated_636766fc1a6d9265ec0177ef {
    static String[] toNoNullStringArray(Object[] array) {
        if (array == null) {
            return null;
        }
        int size = 0;
        for (Object element : array) {
            if (element != null) {
                size++;
            }
        }
        if (size == 0) {
            throw new IllegalArgumentException("array size is zero");
        }
        String[] result = new String[size];
        int i = 0;
        for (Object element : array) {
            if (element != null) {
                result[i++] = element.toString();
            }
        }
        return result;
    }
}