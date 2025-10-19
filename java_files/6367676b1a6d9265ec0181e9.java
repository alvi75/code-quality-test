import java.util.*;

public class Generated_6367676b1a6d9265ec0181e9 {
    public static boolean substringMatch(CharSequence str,int index,CharSequence substring){
		if(index<0 || index>=str.length() || index+substring.length()>str.length()){
			return false;
		}
		for(int i=0;i<substring.length();i++){
			char c=str.charAt(index+i);
			if(c!=substring.charAt(i)){
				return false;
			}
		}
		return true;
	}
}