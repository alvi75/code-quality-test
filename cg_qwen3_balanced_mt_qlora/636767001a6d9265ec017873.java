import java.util.*;

public class Generated_636767001a6d9265ec017873 {
    /**Reverse the given String as per.**/
	public static String reverse(final String str) {
		if (str == null || str.length() < 2) {
			return str;
		}
		final char[] chars = str.toCharArray();
		for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
			char temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
		}
		return new String(chars);
	}
}