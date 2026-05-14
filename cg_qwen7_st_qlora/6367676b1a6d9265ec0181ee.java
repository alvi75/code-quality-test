import java.util.*;

public class Generated_6367676b1a6d9265ec0181ee {
    public static String trimTrailingWhitespace(String str){
		if(str == null || str.length() == 0) return "";
		
		int i = str.length();
		while(i > 0 && Character.isWhitespace(str.charAt(i - 1))) {
			i--;
		}
		return (i < str.length()) ? str.substring(0, i) : str;
	}
}