import java.util.*;

public class Generated_636766821a6d9265ec0174bf {
    public static String capitalize(String name){
		char[] chars = name.toCharArray();
		if (chars.length > 0) {
			chars[0] = Character.toUpperCase(chars[0]);
		}
		return new String(chars);
	}
}