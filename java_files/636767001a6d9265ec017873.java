import java.util.*;

public class Generated_636767001a6d9265ec017873 {
    /**Reverse the given String as per.
 * @param str
@return
*/
    public static String reverse(final String str){
        if(str == null || str.length() <= 1) return str;
        final char[] chars = str.toCharArray();
        int i = 0, j = chars.length - 1;
        while(i < j){
            final char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
            ++i; --j;
        }
        return new String(chars);
    }
}