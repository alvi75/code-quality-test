import java.util.*;

public class Generated_636767001a6d9265ec017873 {
    public static String reverse(final String str){
		char[] chars = str.toCharArray();
		int length = chars.length;
		for (int i = 0; i < length / 2; i++) {
			char tmp = chars[i];
			chars[i] = chars[length - i - 1];
			chars[length - i - 1] = tmp;
		}
		return new String(chars);
	}
}