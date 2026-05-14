import java.util.*;

public class Generated_6367676d1a6d9265ec018229 {
    public static String[] trimArrayElements(String[] array){
		if(array == null) return null;
		
		for(int i = 0; i < array.length; i++){
			array[i] = array[i].trim();
		}
		
		return array;
	}
}