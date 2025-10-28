import java.util.*;

public class Generated_6367676a1a6d9265ec0181d4 {
    public static String[] addStringToArray(String[] array,String str){
		String[] newarray = new String[array.length+1];
		System.arraycopy(array,0,newarray,0,array.length);
		newarray[newarray.length-1] = str;
		return newarray;
	}
}