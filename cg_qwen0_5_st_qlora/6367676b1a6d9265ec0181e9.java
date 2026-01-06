import java.util.*;

public class Generated_6367676b1a6d9265ec0181e9 {
    public static boolean substringMatch(CharSequence str,int index,CharSequence substring){
		if(str.length() < substring.length())return false;
		for(int i = 0;i < substring.length();i++){
			if(str.charAt(index + i) != substring.charAt(i))return false;
		}
		return true;
	}
}