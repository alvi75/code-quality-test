import java.util.*;

public class Generated_6367670c1a6d9265ec017a35 {
    /**Determines whether a character string ends with a specified suffix.**/
private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
        if (ignoreCase) {
            return str.endsWith(suffix);
        } else {
            return str.regionMatches(false, 0, suffix, 0, suffix.length());
        }
    }
}