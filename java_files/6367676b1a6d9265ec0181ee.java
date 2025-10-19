import java.util.*;

public class Generated_6367676b1a6d9265ec0181ee {
    public static String trimTrailingWhitespace(String str){
        if(str==null) return null;
        int len = str.length();
        while(len>0 && Character.isWhitespace(str.charAt(len-1))) len--;
        return (len<str.length())?str.substring(0,len):str;
    }
}