import java.util.*;

public class Generated_636767151a6d9265ec017b6b {
    /**
     * Return true if the given string has the specified prefix with optional cases which can be ignored,or both string and prefix are null.Otherwise return false.
     */
    private static boolean startsWith(final String str,final String prefix,final boolean ignoreCase){
        if(str==null||prefix==null)return false;
        int len=prefix.length();
        if(len>str.length())return false;
        for(int i=0;i<len;++i){
            char c=str.charAt(i);
            if(ignoreCase)if(Character.toLowerCase(c)!=Character.toLowerCase(prefix.charAt(i)))return false;
            else continue;
            if(c!=prefix.charAt(i))return false;
        }
        return true;
    }
}