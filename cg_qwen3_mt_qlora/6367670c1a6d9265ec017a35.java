import java.util.*;

public class Generated_6367670c1a6d9265ec017a35 {
    /**Determines whether a character string ends with a specified suffix.**/
private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
        if(str == null || suffix == null) return false;
        final int strLen = str.length();
        final int sufLen = suffix.length();
        if(sufLen > strLen) return false;
        if(sufLen == 0) return true;
        if(ignoreCase){
            for(int i=sufLen-1,j=strLen-1;i>=0 && j>=0;--i,--j){
                if(Character.toLowerCase(str.charAt(j)) != Character.toLowerCase(suffix.charAt(i))){
                    return false;
                }
            }
        }else{
            for(int i=sufLen-1,j=strLen-1;i>=0 && j>=0;--i,--j){
                if(str.charAt(j) != suffix.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}