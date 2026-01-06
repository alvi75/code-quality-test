import java.util.*;

public class Generated_6367670c1a6d9265ec017a2a {
    public static int[] toPrimitive(final Integer[] array){
        if(array == null) {
            return null;
        }
        else if(array.length == 0) {
            return EMPTY_INT_ARRAY;
        }
        final int[] result = new int[array.length];
        for(int i=0; i<array.length; i++){
            result[i] = array[i].intValue();
        }
        return result;
    }
}