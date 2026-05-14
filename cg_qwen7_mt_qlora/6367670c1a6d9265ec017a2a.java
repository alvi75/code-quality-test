import java.util.*;

public class Generated_6367670c1a6d9265ec017a2a {
    /**Convert the given Integer array to primitives. Return ArrayUtils.EMPTY_INT_ARRAY for an empty array, return null for null array.**/
	public static int[] toPrimitive(final Integer[] array){
		if(array == null) return null;
		final int length = array.length;
		if(length == 0) return EMPTY_INT_ARRAY;
		int[] result = new int[length];
		for(int i=0; i<length; i++){
			result[i] = array[i].intValue();
		}
		return result;
	}
}