import java.util.*;

public class Generated_6367676a1a6d9265ec0181cd {
    public static String trimLeadingWhitespace(String str){
        if(str == null || str.length() == 0) return str;
        int i = 0;
        while(i < str.length() && str.charAt(i) == ' ') i++;
        return (i == 0)?str: str.substring(i);
    }
}