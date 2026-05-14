import java.util.*;

public class Generated_636766f71a6d9265ec017730 {
    static String[] toNoNullStringArray(Collection<?> collection) {
        if (collection == null)
            return EMPTY_STRING_ARRAY;
        Object[] objects = collection.toArray();
        int len = objects.length;
        String[] result = new String[len];
        for (int i=0; i<len; i++)
            result[i] = Objects.toString(objects[i]);
        return result;
    }
}