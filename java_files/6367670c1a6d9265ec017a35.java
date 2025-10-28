import java.util.*;

public class Generated_6367670c1a6d9265ec017a35 {
    /**
     * Determines whether a character string ends with a specified suffix.
     */
    private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
        if(str==null || suffix==null) return false;
        final int len = str.length();
        final int slen = suffix.length();
        if(slen>len) return false;
        if(slen==0) return true;
        if(ignoreCase){
            for(int i=0;i<slen;++i){
                if(Character.toLowerCase(str.charAt(len-slen+i))!=Character.toLowerCase(suffix.charAt(i)))return false;
            }
        }else{
            for(int i=0;i<slen;++i){
                if(str.charAt(len-slen+i)!=suffix.charAt(i))return false;
            }
        }
        return true;
    }
}