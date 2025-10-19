import java.util.*;

public class Generated_6367676b1a6d9265ec0181ee {
    public static String trimTrailingWhitespace(String str){
		int len = str.length();
		for(int i=len-1;i>=0;--i){
			if(str.charAt(i) != ' ' && str.charAt(i) != '\t' && str.charAt(i) != '\n' && str.charAt(i) != '\r'){
				return str.substring(0, i+1);
			}
		}
		return "";
	}
}