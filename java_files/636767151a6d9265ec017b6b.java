import java.util.*;

public class Generated_636767151a6d9265ec017b6b {
    private static boolean startsWith(final String str,final String prefix,final boolean ignoreCase){
        if(str==null || prefix==null) {return false;}
        final int len = str.length();
        final int pLen = prefix.length();

        if(pLen > len) {
            return false;
        }

        for(int i=0; i<pLen;i++) {
            if(ignoreCase ? !str.regionMatches(i,prefix, i, 1) : !str.startsWith(prefix)) {
                return false;
            }
        }

        return true;
    }
}