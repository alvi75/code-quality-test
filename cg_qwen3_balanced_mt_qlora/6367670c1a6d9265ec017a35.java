import java.util.*;

public class Generated_6367670c1a6d9265ec017a35 {
    /**Determines whether a character string ends with a specified suffix.**/
    private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
        if (str == null || suffix == null) {
            return false;
        }
        int strLen = str.length();
        int sufLen = suffix.length();
        if (sufLen > strLen) {
            return false;
        }
        int strIdx = strLen - 1;
        int sufIdx = sufLen - 1;
        char ch = str.charAt(strIdx);
        char sch = suffix.charAt(sufIdx);
        if (ch != sch && (!ignoreCase && Character.toLowerCase(ch) != Character.toLowerCase(sch))) {
            return false;
        }
        do {
            strIdx--;
            sufIdx--;
            ch = str.charAt(strIdx);
            sch = suffix.charAt(sufIdx);
            if (ch != sch && (!ignoreCase && Character.toLowerCase(ch) != Character.toLowerCase(sch))) {
                return false;
            }
        } while (sufIdx >= 0);
        return true;
    }
}