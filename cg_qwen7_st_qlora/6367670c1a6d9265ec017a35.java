import java.util.*;

public class Generated_6367670c1a6d9265ec017a35 {
    private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
        if(str==null||suffix==null) return false;
        final int len = suffix.length();
        if(len>str.length()) return false;
        else{
            final char[] cs1 = str.toCharArray(),cs2 = suffix.toCharArray();
            for(int i=0;i<len;++i)
                if(ignoreCase?Character.toLowerCase(cs1[str.length()-len+i])!=Character.toLowerCase(cs2[i]):cs1[str.length()-len+i]!=cs2[i])
                    return false;
            return true;
        }
    }
}