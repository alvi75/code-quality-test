import java.util.*;

public class Generated_6367670c1a6d9265ec017a35 {
    private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
        if(str==null || suffix==null){
            return false;
        }
        int strLen = str.length();
        int suffixLen = suffix.length();
        if(suffixLen > strLen){
            return false;
        }
        final int offset = strLen - suffixLen;
        if(offset < 0){
            return true;
        }
        for(int i=offset,j=suffixLen-1;i>=0;i--,j--){
            char c1 = str.charAt(i);
            char c2 = suffix.charAt(j);
            if(c1!=c2){
                if(ignoreCase){
                    c1 = Character.toUpperCase(c1);
                    c2 = Character.toUpperCase(c2);
                }
                if(c1!=c2){
                    return false;
                }
            }
        }
        return true;
    }
}