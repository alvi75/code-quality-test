import java.util.*;

public class Generated_636766fc1a6d9265ec0177ef {
    static String[] toNoNullStringArray(Object[] array){
        if(array == null) {
            return null;
        }
        int length = array.length;
        if(length == 0) {
            throw new IllegalArgumentException("The array should not be empty.");
        }

        String[] result = new String[length];
        for(int i = 0; i < length; i++) {
            Object element = array[i];
            if(element != null) {
                result[i] = element.toString();
            } else {
                throw new IllegalArgumentException("The array should not contain null value.");
            }
        }
        return result;
    }
}