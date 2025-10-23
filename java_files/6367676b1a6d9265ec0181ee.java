import java.util.*;

public class Generated_6367676b1a6d9265ec0181ee {
    public static String trimTrailingWhitespace(String str){
        if(str == null || str.length() == 0) return str;
        int i = str.length()-1;
        while(i >= 0 && Character.isWhitespace(str.charAt(i))) --i;
        return str.substring(0, i+1);
    }
}