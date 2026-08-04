import java.util.*;

public class Generated_6367670c1a6d9265ec017a35 {
    private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
        if(str == null || suffix == null) return false;
        if(suffix.length() > str.length()) return false;
        int strOffset = str.length() - suffix.length();
        return str.regionMatches(ignoreCase,strOffset,suffix,0,suffix.length());
    }
}