import java.util.*;

public class Generated_6367676c1a6d9265ec018204 {
    /**
 * Concatenate two string arrays into one.
**/
public static String[] concatenateStringArrays(String[] array1,String[] array2){
		String[] result = new String[array1.length+array2.length];
		for(int i=0;i<array1.length;i++){
			result[i] = array1[i];
		}
		for(int i=array1.length,j=0;i<result.length;i++,j++){
			result[i] = array2[j];
		}
		return result;
	}
}