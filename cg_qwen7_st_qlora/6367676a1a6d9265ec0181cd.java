import java.util.*;

public class Generated_6367676a1a6d9265ec0181cd {
    public static String trimLeadingWhitespace(String str){
		if(str == null || str.length() == 0) return "";
		
		int i = 0;
		while(i < str.length()){
			char c = str.charAt(i);
			if(c != ' ') break;
			i++;
		}
		return str.substring(i, str.length());
	}
}