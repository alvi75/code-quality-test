import java.util.*;

public class Generated_636767151a6d9265ec017b6b {
    /**
 * Return true if the given string has the specified prefix with optional cases which can be ignored,or both string and prefix are null.Otherwise return false.
 */
    private static boolean startsWith(final String str,final String prefix,final boolean ignoreCase){
        if(str==null||prefix==null)return false;
        int len=str.length();
        int plen=prefix.length();
        if(len<plen)return false;
        for(int i=0;i<plen;++i){
            char c1=str.charAt(i);
            char c2=ignoreCase?Character.toLowerCase(c1):c1;
            char c3=ignoreCase?Character.toLowerCase(prefix.charAt(i)):prefix.charAt(i);
            if(c2!=c3)return false;
        }
        return true;
    }
}