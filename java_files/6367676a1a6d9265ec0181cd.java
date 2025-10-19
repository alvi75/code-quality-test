import java.util.*;

public class Generated_6367676a1a6d9265ec0181cd {
    /**Trim the leading whitespaces in a string.**/
    public static String trimLeadingWhitespace(String str){
        if(str == null || str.length() == 0)
            return "";
        int start = 0;
        for(;start < str.length();start++){
            char c = str.charAt(start);
            if(c != ' ' && c != '\t' && c != '\n')
                break;
        }
        return (start == 0) ? str : str.substring(start);
    }
}