import java.util.*;

public class Generated_636766fe1a6d9265ec017838 {
    public static char[] toPrimitive(final Character[] array){
        if(array == null || array.length == 0){
            return ArrayUtils.EMPTY_CHAR_ARRAY;
        }
        final char[] result = new char[array.length];
        for(int i = 0; i < array.length; i++){
            result[i] = array[i].charValue();
        }
        return result;
    }
}