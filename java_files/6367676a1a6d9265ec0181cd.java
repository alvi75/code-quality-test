import java.util.*;

public class Generated_6367676a1a6d9265ec0181cd {
    /**Trim the leading whitespaces in a string.**/
    public static String trimLeadingWhitespace(String str){
        int i;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)!=' ' && str.charAt(i)!='\t' && str.charAt(i)!='\n' && str.charAt(i)!='\r'){
                return str.substring(i);
            }
        }
        return "";
    }
}