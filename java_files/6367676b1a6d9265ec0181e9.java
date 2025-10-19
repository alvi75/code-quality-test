import java.util.*;

public class Generated_6367676b1a6d9265ec0181e9 {
    public static boolean substringMatch(CharSequence str,int index,CharSequence substring){
		if(str.length()-index<substring.length())return false;
		int j=0;
		for(int i=index;i<str.length()&&j<substring.length();i++,j++){
			char c=str.charAt(i);
			char sc=substring.charAt(j);
			if(c!=sc)return false;
		}
		return true;
	}
}