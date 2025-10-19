import java.util.*;

public class Generated_636766fc1a6d9265ec0177ef {
    static String[] toNoNullStringArray(Object[] array){
		int count = 0;
		for (Object object : array) {
			if(object != null)
				count++;
		}
		if(count == 0)
			throw new IllegalArgumentException("The given array does not contain any element is not null.");
		
		String[] result = new String[count];
		count = 0;
		for (Object object : array) {
			if(object != null)
				result[count++] = object.toString();
		}
		return result;
	}
}