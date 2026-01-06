import java.util.*;

public class Generated_6367676a1a6d9265ec0181d4 {
    public static String[] addStringToArray(String[] array,String str){
		String[] newArray = new String[array.length+1];
		System.arraycopy(array,0,newArray,0,array.length);
		newArray[array.length] = str;
		return newArray;
	}
}