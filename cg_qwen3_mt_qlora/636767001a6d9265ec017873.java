import java.util.*;

public class Generated_636767001a6d9265ec017873 {
    /**Reverse the given String as per.**/
public static String reverse(final String str){
        if(str == null || str.length() <= 1) return str;
        final char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;
        while(left < right){
            swap(chars, left++, right--);
        }
        return new String(chars);
    }
}