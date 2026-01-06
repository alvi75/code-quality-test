import java.util.*;

public class Generated_636767691a6d9265ec0181a7 {
    public static String trimLeadingCharacter(String str,char leadingCharacter){
		if(str==null || str.length()==0) return "";
		int i=0;
		while(i<str.length() && str.charAt(i)==leadingCharacter)
			i++;
		return (i>0)?str.substring(i):"";

	}
}