import java.util.*;

public class Generated_636766ff1a6d9265ec017842 {
    /**If the length of the array is 0, return EMPTY_DOUBLE_ARAY. Otherwise, convert the array to an array of the double type.**/
	public static double[] toPrimitive(final Double[] array){
		if (array == null) {
			return EMPTY_DOUBLE_ARRAY;
		}
		
		final int length = array.length;
		if(length == 0){
			return EMPTY_DOUBLE_ARRAY;
		}

		final double[] result = new double[length];
		for(int i=0; i<length; i++){
			result[i] = array[i].doubleValue();
		}
		return result;
	}
}