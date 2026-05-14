import java.util.*;

public class Generated_636766fc1a6d9265ec0177ef {
    static String[] toNoNullStringArray(Object[] array) {
        if (array == null)
            return ArrayUtils.EMPTY_STRING_ARRAY;
        List<String> noNullList = new ArrayList<String>(array.length);
        for (int i = 0; i < array.length; i++) {
            Object obj = array[i];
            if (obj != null)
                noNullList.add(obj.toString());
        }
        return noNullList.toArray(ArrayUtils.EMPTY_STRING_ARRAY);
    }
}