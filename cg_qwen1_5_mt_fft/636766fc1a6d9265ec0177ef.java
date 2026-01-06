import java.util.*;

public class Generated_636766fc1a6d9265ec0177ef {
    static String[] toNoNullStringArray(Object[] array){
		if(array == null || array.length == 0)
			throw new IllegalArgumentException("array cannot be null or empty");
		
		String[] result = new String[array.length];
		for(int i=0; i<result.length;i++){
			Object o = array[i];
			result[i] = (o != null) ? o.toString() : "";
		}
		return result;
	}
}