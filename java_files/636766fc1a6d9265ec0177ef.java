import java.util.*;

public class Generated_636766fc1a6d9265ec0177ef {
    /**
 * Return a new array of strings converted from the elements which are not null of the given array,if the size of the array is zero,it will throw an exception.
 */
static String[] toNoNullStringArray(Object[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("The array must contain at least one element.");
        }
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            Object o = array[i];
            if (o != null) {
                result[i] = o.toString();
            } else {
                result[i] = "";
            }
        }
        return result;
    }
}