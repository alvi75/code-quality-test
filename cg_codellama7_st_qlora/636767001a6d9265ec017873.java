import java.util.*;

public class Generated_636767001a6d9265ec017873 {
    public static String reverse(final String str){
        if(str == null){
            return null;
        }
        final char[] chars = str.toCharArray();
        for(int i = 0, j = chars.length - 1; i < j; i++, j--){
            final char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}