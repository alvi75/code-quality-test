import java.util.*;

public class Generated_636766fc1a6d9265ec0177ef {
    /**
 * Return a new array of strings converted from the elements which are not null of the given array,if the size of the array is zero,it will throw an exception.
 */ static String[] toNoNullStringArray(Object[] array) {
        if (array.length == 0)
            throw new IllegalArgumentException("The length of the array must be greater than 0");
        for (int i = 0; i < array.length; i++) {
            Object o = array[i];
            if (o != null && !(o instanceof String))
                throw new IllegalArgumentException("All elements in the array must be Strings or null");
        }
        return (String[]) array;
    }
}