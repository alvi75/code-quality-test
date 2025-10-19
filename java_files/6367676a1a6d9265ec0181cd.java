import java.util.*;

public class Generated_6367676a1a6d9265ec0181cd {
    public static String trimLeadingWhitespace(String str){
		if(str == null || str.length() == 0){
			return "";
		}
		
		int start = 0;
		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			if(!Character.isWhitespace(c)){
				start = i;
				break;
			}
		}
		
		if(start==0){
			return str;
		}else{
			return str.substring(start);
		}
	}
}