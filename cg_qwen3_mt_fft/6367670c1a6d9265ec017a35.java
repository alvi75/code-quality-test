import java.util.*;

public class Generated_6367670c1a6d9265ec017a35 {
    private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
		if(str.endsWith(suffix)){
			return true;
		}
		if(ignoreCase){
			final int len = str.length();
			if(len >= suffix.length()){
				final int end = len - suffix.length();
				for(int i=0;i<end;i++){
					if(str.charAt(i) != Character.toUpperCase(suffix.charAt(i))){
						break;
					}
				}
				for(int i=end;i<len;i++){
					if(str.charAt(i) != Character.toLowerCase(suffix.charAt(i))){
						break;
					}
				}
				return true;
			}
		}
		return false;
	}
}