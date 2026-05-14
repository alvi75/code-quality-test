import java.util.*;

public class Generated_6367676b1a6d9265ec0181df {
    public static boolean startsWithIgnoreCase(String str,String prefix){
		if(str == null || prefix==null)
			return false;
		
		char[] p = prefix.toCharArray();
		for(int i=0;i<p.length;i++){
			if(Character.toLowerCase(p[i]) != Character.toLowerCase(str.charAt(i)))
				return false;
		}
		return true;
	}
}