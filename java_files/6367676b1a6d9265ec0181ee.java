import java.util.*;

public class Generated_6367676b1a6d9265ec0181ee {
    public static String trimTrailingWhitespace(String str){
        if(str == null || str.length() == 0) return str;
        int len = str.length();
        while(len > 0 && str.charAt(len - 1) == ' ') len--;
        return str.substring(0, len);
    }
}