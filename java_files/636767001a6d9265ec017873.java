import java.util.*;

public class Generated_636767001a6d9265ec017873 {
    /**Reverse the given String as per.**/
public static String reverse(final String str){
        if (str == null) {
            return null;
        }
        char[] chars = str.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len / 2; i++) {
            char tmp = chars[i];
            chars[i] = chars[len - 1 - i];
            chars[len - 1 - i] = tmp;
        }
        return new String(chars);
    }
}