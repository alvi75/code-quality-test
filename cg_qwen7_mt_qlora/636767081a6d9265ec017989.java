import java.util.*;

public class Generated_636767081a6d9265ec017989 {
    /**Convert the given Boolean array to primitives. Return ArrayUtils.EMPTY_BOOLEAN_ARRAY for an empty array, return null for null array.**/
	public static boolean[] toPrimitive(final Boolean[] array){
		if(array == null) return null;
		final int length = array.length;
		if(length == 0) return EMPTY_BOOLEAN_ARRAY;
		boolean[] result = new boolean[length];
		for(int i=0; i<length; i++){
			result[i] = array[i].booleanValue();
		}
		return result;
	}
}