import java.util.*;

public class Generated_6367676b1a6d9265ec0181ee {
    public static String trimTrailingWhitespace(String str) {
        if (str == null || str.length() == 0)
            return str;
        int endIndex = str.length();
        while (--endIndex >= 0 && Character.isWhitespace(str.charAt(endIndex)))
            ;
        return str.substring(0, endIndex + 1);
    }
}