import java.util.*;

public class Generated_6367676a1a6d9265ec0181cd {
    public static String 
    trimLeadingWhitespace(String str) {
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return str.substring(i);
            }
        }
        return "";
    }
}