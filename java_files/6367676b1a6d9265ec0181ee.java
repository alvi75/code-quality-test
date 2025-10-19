import java.util.*;

public class Generated_6367676b1a6d9265ec0181ee {
    /**Trim the end space of the str.
@since 1.0
@param str The string to be trimmed.
@return The trimmed string.
*/
public static String trimTrailingWhitespace(String str) {
        if (str == null || str.length() == 0)
            return str;
        int len = str.length();
        while ((len > 0) && Character.isWhitespace(str.charAt(len - 1))) {
            --len;
        }
        return str.substring(0, len);
    }
}