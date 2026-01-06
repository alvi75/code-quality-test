import java.util.*;

public class Generated_6367676a1a6d9265ec0181cd {
    /**
 * Trim the leading whitespaces in a string.
 **/
public static String trimLeadingWhitespace(String str){
        if(str == null) return null;
        int i = 0;
        while(i < str.length() && Character.isWhitespace(str.charAt(i))) i++;
        return str.substring(i);
    }
}