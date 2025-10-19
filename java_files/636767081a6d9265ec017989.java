import java.util.*;

public class Generated_636767081a6d9265ec017989 {
    /**Convert the given Boolean array to primitives. Return ArrayUtils.EMPTY_BOOLEAN_ARRAY for an empty array, return null for null array.**/
    public static boolean[] toPrimitive(final Boolean[] array){
        if(ArrayUtils.isEmpty(array)){//for empty array
            return ArrayUtils.EMPTY_BOOLEAN_ARRAY;
        }
        final boolean[] res = new boolean[array.length];
        for(int i=0; i<array.length; ++i){
            res[i] = array[i].booleanValue();
        }
        return res;
    }
}