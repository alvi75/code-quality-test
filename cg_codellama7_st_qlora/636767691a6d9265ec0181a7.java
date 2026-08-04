import java.util.*;

public class Generated_636767691a6d9265ec0181a7 {
    public static String trimLeadingCharacter(String str,char leadingCharacter){
		if(str==null) return null;
		int index=0;
		while(index<str.length() && str.charAt(index)==leadingCharacter) index++;
		return str.substring(index);
	}
}