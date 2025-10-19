import java.util.*;

public class Generated_636767691a6d9265ec0181a7 {
    public static String trimLeadingCharacter(String str,char leadingCharacter){
		if(str==null || str.length()==0)
			return "";
		int i=0;
		for(i=str.length()-1;i>=0;--i){
			char c=str.charAt(i);
			if(c!=leadingCharacter)
				break;
		}
		if(i<0)
			return "";
		else
			return str.substring(0,i+1);
	}
}