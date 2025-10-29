import java.util.*;

public class Generated_6367670c1a6d9265ec017a35 {
    /**Determines whether a character string ends with a specified suffix.**/
    private static boolean endsWith(final String str,final String suffix,
                                     final boolean ignoreCase){
        if(str == null || suffix == null){
            return false;
        }
        if(suffix.length() > str.length()){
            return false;
        }
        int index = str.length() - suffix.length();
        if(ignoreCase){
            return str.regionMatches(true,index,suffix,0,suffix.length());
        }else{
            return str.regionMatches(false,index,suffix,0,suffix.length());
        }
    }
}