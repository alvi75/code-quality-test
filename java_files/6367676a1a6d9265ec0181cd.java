import java.util.*;

public class Generated_6367676a1a6d9265ec0181cd {
    /**Trim the leading whitespaces in a string.
@see #trimTrailingWhitespace
@param str The string to be trimmed.
@return A new string with all leading whitespace removed.
@since 1.0
*/
public static String trimLeadingWhitespace(String str) {
        int i = 0;
        while (i < str.length() && Character.isWhitespace(str.charAt(i))) {
            ++i;
        }
        return str.substring(i);
    }
}