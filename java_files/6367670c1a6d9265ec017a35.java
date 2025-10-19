import java.util.*;

public class Generated_6367670c1a6d9265ec017a35 {
    private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
		if(str==null || suffix==null)
			return false;
		final int len = suffix.length();
		for(int i=0;i<len;++i){
			char c = str.charAt(str.length()-len+i);
			if(c!=suffix.charAt(i) && !ignoreCase)
				return false;
		}
		return true;
	}
}