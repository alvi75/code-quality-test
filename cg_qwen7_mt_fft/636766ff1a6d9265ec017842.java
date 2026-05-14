import java.util.*;

public class Generated_636766ff1a6d9265ec017842 {
    public static double[] toPrimitive(final Double[] array){
		if(array == null) {
			return new double[0];
		}
		
		final int length = array.length;
		double[] result = new double[length];
		for(int i=0; i<length; i++){
			result[i] = array[i].doubleValue();
		}
		return result;
	}
}