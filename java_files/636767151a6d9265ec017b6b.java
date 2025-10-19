import java.util.*;

public class Generated_636767151a6d9265ec017b6b {
    private static boolean startsWith(final String str,final String prefix,final boolean ignoreCase){
		if(str==null && prefix==null)return true;
		if(str==null || prefix==null)return false;
		
		return str.regionMatches(ignoreCase,str.indexOf(prefix),prefix,0,prefix.length());
	}
}