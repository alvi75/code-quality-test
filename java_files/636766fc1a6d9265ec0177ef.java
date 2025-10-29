import java.util.*;

public class Generated_636766fc1a6d9265ec0177ef {
    public static String[] toNoNullStringArray(Object[] array) { 
        if (array == null || array.length == 0) {
            return NO_NULL_STRINGS;
        }
        else {
            String[] result = new String[array.length];
            for (int i = 0; i < array.length; i++) {
                Object element = array[i];
                if (element != null) {
                    result[i] = element.toString();
                }
                else {
                    result[i] = NO_NULL_STRINGS[0];
                }
            }
            return result;
        }
    }
}