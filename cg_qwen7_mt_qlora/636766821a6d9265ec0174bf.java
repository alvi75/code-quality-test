import java.util.*;

public class Generated_636766821a6d9265ec0174bf {
    /**Converts a name of the string type to a character array and converts the first letter to an uppercase letter.**/
	public static String capitalize(String name){
		if(name == null || name.length() < 1) return "";
		char[] chars = new char[name.length()];
		name.getChars(0, name.length(), chars, 0);
		chars[0] = Character.toUpperCase(chars[0]);
		return new String(chars);
	}
}