import java.util.*;

public class Generated_6367670c1a6d9265ec017a35 {
    /**Determines whether a character string ends with a specified suffix.**/
private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
        if(str == null || suffix == null) return false;
        final int len = suffix.length();
        if(len > str.length()) return false;
        final int end = str.length() - len;
        for(int i = 0; i < len; ++i){
            if(ignoreCase){
                if(Character.toLowerCase(str.charAt(end + i)) != Character.toLowerCase(suffix.charAt(i))) return false;
            }else{
                if(str.charAt(end + i) != suffix.charAt(i)) return false;
            }
        }
        return true;
    }
}