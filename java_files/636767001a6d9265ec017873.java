import java.util.*;

public class Generated_636767001a6d9265ec017873 {
    public static String reverse(final String str){
		if(str==null || str.length()==0)
			return "";
		
		char[] chars = new char[str.length()];
		for(int i=chars.length-1; i>=0; i--)
			chars[i] = str.charAt(i);
		return new String(chars);
	}
}