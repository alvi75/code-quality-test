import java.util.*;

public class Generated_636767001a6d9265ec017873 {
    /**Reverse the given String as per.**/
    public static String reverse(final String str){
        if (str == null) {
            return null;
        }
        final int length = str.length();
        final char[] chars = new char[length];
        for(int i=0; i<length; i++){
            chars[i] = str.charAt(length - 1 - i);
        }
        return new String(chars);
    }
}