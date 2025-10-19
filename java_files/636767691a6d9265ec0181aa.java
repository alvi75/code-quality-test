import java.util.*;

public class Generated_636767691a6d9265ec0181aa {
    public static int nullSafeHashCode(long[] array){
		if(array == null) return 0;
		int result = 1;
		for(int i=0; i<array.length; i++){
			result = (result * MULTIPLIER + Arrays.hashCode(array[i]));
		}
		return result;
	}
}