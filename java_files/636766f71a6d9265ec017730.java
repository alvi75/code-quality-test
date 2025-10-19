import java.util.*;

public class Generated_636766f71a6d9265ec017730 {
    /**
 * If collection is null, convert collection to EMPTY_STRING_ARRAY. Otherwise, convert collection to an array of strings and return the array.
 */
    static String[] toNoNullStringArray(Collection<?> collection) {
        if (collection == null)
            return EMPTY_STRING_ARRAY;
        else
            return collection.toArray(new String[0]);
    }
}