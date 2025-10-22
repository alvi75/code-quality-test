import java.util.*;

public class Generated_6367676d1a6d9265ec018229 {
    /**
 * Trim each element in the given string array and return the resulting array.
 **/
public static String[] trimArrayElements(String[] array){
		String[] trimmed = new String[array.length];
		for(int i=0; i<array.length; i++){
			trimmed[i] = trim(array[i]);
		}
		return trimmed;
	}
}