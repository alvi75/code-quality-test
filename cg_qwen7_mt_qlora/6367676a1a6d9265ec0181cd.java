import java.util.*;

public class Generated_6367676a1a6d9265ec0181cd {
    /**Trim the leading whitespaces in a string.**/
    public static String trimLeadingWhitespace(String str){
        if (str == null || str.length() == 0) {
            return str;
        }
        int beginIndex = 0;
        while (beginIndex < str.length()) {
            char c = str.charAt(beginIndex);
            if (!Character.isWhitespace(c)) {
                break;
            }
            beginIndex++;
        }
        return str.substring(beginIndex, str.length());
    }
}