import java.util.*;

public class Generated_6367676c1a6d9265ec018204 {
    public static String[] concatenateStringArrays(String[] array1,String[] array2){
		int length = 0;
		if(array1 != null && array1.length > 0)
			length += array1.length;
		if(array2 != null && array2.length > 0)
			length += array2.length;
		
		String[] result = new String[length];
		if(length > 0) {
			System.arraycopy(array1, 0, result, 0, array1.length);
			System.arraycopy(array2, 0, result, array1.length, array2.length);
		}
		
		return result;
	}
}