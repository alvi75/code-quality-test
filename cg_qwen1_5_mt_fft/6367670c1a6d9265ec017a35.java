import java.util.*;

public class Generated_6367670c1a6d9265ec017a35 {
    private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
        if(str==null || suffix==null) return false;
        final int len = str.length();
        final int suffixLen = suffix.length();
        if(suffixLen > len) return false;

        for(int i=0; i<suffixLen;i++){
            if(ignoreCase ? toLowerCase(str.charAt(len - (suffixLen - i))] != toLowerCase(suffix.charAt(suffixLen - 1 - i)) : !str.substring(len - (suffixLen - i)).equalsIgnoreCase(suffix.substring(suffixLen - 1 - i))) {
                return false;
            }
        }

        return true;
    }
}