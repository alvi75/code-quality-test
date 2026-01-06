import java.util.*;

public class Generated_636767151a6d9265ec017b6b {
    /**Return true if the given string has the specified prefix with optional cases which can be ignored,or both string and prefix are null.Otherwise return false.
 * @param str The string to check.
 * @param prefix The prefix to check for.
 * @param ignoreCase True if case should be ignored.
 * @return True if the given string has the specified prefix with optional cases which can be ignored,or both string and prefix are null.Otherwise return false.
 */
    private static boolean startsWith(final String str,final String prefix,final boolean ignoreCase){
        if(str==null || prefix==null)return false;
        int len = prefix.length();
        if(len>str.length())return false;
        if(ignoreCase){
            for(int i=0;i<len;++i)
                if(Character.toLowerCase(prefix.charAt(i))!=Character.toLowerCase(str.charAt(i)))return false;
        }else{
            for(int i=0;i<len;++i)
                if(prefix.charAt(i)!=str.charAt(i))return false;
        }
        return true;
    }
}