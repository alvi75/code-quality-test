import java.util.*;

public class Generated_636767001a6d9265ec017873 {
    public static String reverse(final String str){
        if(str == null) return null;
        char[] chars = str.toCharArray();
        int start=0, end=str.length()-1;
        while(start<end){
            char tmp=chars[start];
            chars[start++]=chars[end];
            chars[end--]=tmp;
        }
        return new String(chars);
    }
}