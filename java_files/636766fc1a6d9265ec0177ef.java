import java.util.*;

public class Generated_636766fc1a6d9265ec0177ef {
    static String[] toNoNullStringArray(Object[] array) {
        if (array == null || array.length == 0)
            throw new NullPointerException("Array is null or empty");
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++)
            if (array[i] != null)
                result[i] = array[i].toString();
        return result;
    }
}