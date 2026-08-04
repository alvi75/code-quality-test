import java.util.*;

public class Generated_6367676b1a6d9265ec0181ee {
    public static String trimTrailingWhitespace(String str){
        if(str == null) return null;
        int len = str.length();
        int i = len - 1;
        while(i >= 0 && Character.isWhitespace(str.charAt(i))){
            i--;
        }
        return str.substring(0, i + 1);
    }
}