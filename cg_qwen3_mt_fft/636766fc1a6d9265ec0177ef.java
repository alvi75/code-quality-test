import java.util.*;

public class Generated_636766fc1a6d9265ec0177ef {
    static String[] toNoNullStringArray(Object[] array){
        int i = 0;
        for (Object o : array) {
            if (o == null) {
                return null;
            }
            ++i;
        }
        String[] result = new String[i];
        for (int j = 0; j < i; j++) {
            result[j] = ((String) array[j]);
        }
        return result;
    }
}