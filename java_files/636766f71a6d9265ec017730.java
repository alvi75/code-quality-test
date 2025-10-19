import java.util.*;

public class Generated_636766f71a6d9265ec017730 {
    static String[] toNoNullStringArray(Collection<?> collection){
        if (collection == null) {
            return EMPTY_STRING_ARRAY;
        } else {
            Object[] objectArray = collection.toArray();
            int length = 0;
            for (Object o : objectArray) {
                if (o != null) {
                    length++;
                }
            }
            String[] stringArray = new String[length];
            int i = 0;
            for (Object o : objectArray) {
                if (o != null) {
                    stringArray[i++] = o.toString();
                }
            }
            return stringArray;
        }
    }
}