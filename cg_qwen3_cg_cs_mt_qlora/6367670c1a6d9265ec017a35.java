import java.util.*;

public class Generated_6367670c1a6d9265ec017a35 {
    /**
 * Determines whether a character string ends with a specified suffix.
 */
private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
        if(str == null || suffix == null) return false;
        final int strLen = str.length();
        final int sufLen = suffix.length();
        if(sufLen > strLen) return false;
        if(ignoreCase){
            for(int i = 0; i < sufLen; i++){
                if(Character.toLowerCase(str.charAt(strLen - i - 1)) != Character.toLowerCase(suffix.charAt(sufLen - i - 1))) return false;
            }
        }else{
            for(int i = 0; i < sufLen; i++){
                if(str.charAt(strLen - i - 1) != suffix.charAt(sufLen - i - 1)) return false;
            }
        }
        return true;
    }
}