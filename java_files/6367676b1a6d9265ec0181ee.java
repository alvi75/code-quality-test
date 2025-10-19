import java.util.*;

public class Generated_6367676b1a6d9265ec0181ee {
    public static String 
    trimTrailingWhitespace(String str) {
        if (str == null || str.length() == 0)
            return str;
        
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (!Character.isWhitespace(ch)) {
                return str.substring(0, i + 1);
            }
        }
        return "";
    }
}