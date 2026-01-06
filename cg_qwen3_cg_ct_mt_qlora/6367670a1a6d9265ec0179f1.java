import java.util.*;

public class Generated_6367670a1a6d9265ec0179f1 {
    public static Short[] toObject(final short[] array){
		if(array==null) return null;
		final int length = array.length;
		final Short[] result = new Short[length];
		for(int i=0;i<length;i++){
			result[i] = Short.valueOf(array[i]);
		}
		return result;
	}
}