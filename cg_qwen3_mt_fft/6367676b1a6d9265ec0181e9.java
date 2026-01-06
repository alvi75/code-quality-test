import java.util.*;

public class Generated_6367676b1a6d9265ec0181e9 {
    public static boolean substringMatch(CharSequence str,int index,CharSequence substring){
		if(str.length()<index+substring.length())return false;
		for(int i=0;i<substring.length();i++){
			char c=str.charAt(index+i);
			char d=substring.charAt(i);
			if(c!=d)return false;
		}
		return true;
	}
}