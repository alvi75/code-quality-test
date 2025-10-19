import java.util.*;

public class Generated_6367676a1a6d9265ec0181d4 {
    public static String[] addStringToArray(String[] array,String str){
		String[] newarray = null;
		if (array == null || array.length == 0) {
			newarray = new String[1];
			newarray[0] = str;
		} else if (array.length < 256) {
			newarray = new String[array.length + 1];
			System.arraycopy(array, 0, newarray, 0, array.length);
			newarray[array.length] = str;
		} else {
			newarray = new String[256];
			System.arraycopy(array, 0, newarray, 0, 255);
			newarray[255] = str;
		}
		return newarray;
	}
}