import java.util.*;

public class Generated_6367676a1a6d9265ec0181d4 {
    /**
 * Append a string to a string array.
**/
public static String[] addStringToArray(String[] array,String str){
		String[] newArray = new String[array.length+1];
		for(int i=0;i<array.length;i++){
			newArray[i] = array[i];
		}
		newArray[array.length] = str;
		return newArray;
	}
}