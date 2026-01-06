import java.util.*;

public class Generated_6367676b1a6d9265ec0181df {
    public static boolean startsWithIgnoreCase(String str,String prefix){
		if(str==null || prefix==null) return false;
		
		str = str.trim();
		prefix = prefix.trim();
		
		int len=str.length();
		int pLen=prefix.length();
		
		if(len<pLen) return false;
		
		for(int i=0;i<pLen;i++){
			char c=str.charAt(i);
			char d=prefix.charAt(i);
			
			if(Character.toLowerCase(c)!=Character.toLowerCase(d)) return false;
		}
		
		return true;
	}
}