import java.util.*;

public class Generated_636767001a6d9265ec017873 {
    /**Reverse the given String as per.**/
public static String reverse(final String str) {
        if (str == null || str.length() == 0) return str;
        char[] chars = str.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[len - i - 1];
            chars[len - i - 1] = temp;
        }
        return new String(chars);
    }
}