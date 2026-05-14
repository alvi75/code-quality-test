import java.util.*;

public class Generated_636767151a6d9265ec017b6b {
    private static boolean startsWith(final String str,final String prefix,final boolean ignoreCase){
        if(str==null||prefix==null) return str==prefix;
        else{
            int len=prefix.length();
            if(len>str.length()) return false;
            for(int i=0;i<len;i++){
                char c1=str.charAt(i);
                char c2=prefix.charAt(i);
                if(ignoreCase&&Character.toLowerCase(c1)==Character.toLowerCase(c2)) continue;
                else if(!ignoreCase&&c1!=c2) return false;
            }
            return true;
        }
    }
}