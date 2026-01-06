import java.util.*;

public class Generated_636766f31a6d9265ec01768f {
    /**Return a clone of the given array.*/
    public static char[] clone(final char[] array){
        final int length = array.length;
        if(length == 0) return new char[0];
        final char[] result = new char[length];
        System.arraycopy(array, 0, result, 0, length);
        return result;
    }
}