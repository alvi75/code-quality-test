import java.util.*;

public class Generated_6367676b1a6d9265ec0181e9 {
    public static boolean substringMatch(CharSequence str,int index,CharSequence substring){
		if(substring instanceof String)
			return ((String)substring).regionMatches(index,str,index+((String)substring).length());
		
		int subLen=substring.length();
		if(str.length()-index<subLen)
			return false;
		
		for(int i=index,j=0;i<subLen;++i,++j){
			if(str.charAt(i)!=substring.charAt(j))
				return false;
		}
		
		return true;
	}
}