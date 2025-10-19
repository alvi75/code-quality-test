import java.util.*;

public class Generated_6367676b1a6d9265ec0181e9 {
    public static boolean substringMatch(CharSequence str,int index,CharSequence substring){
		if(substring == null || str == null) {
			return false;
		}
		
		int len = substring.length();
		if(len > 0 && len <= str.length()) {
			for(int i=0;i<len;i++) {
				if(str.charAt(i) != substring.charAt(i)) {
					return false;
				}
			}
			
			return true;
		} else {
			return false;
		}
	}
}