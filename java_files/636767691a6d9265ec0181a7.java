import java.util.*;

public class Generated_636767691a6d9265ec0181a7 {
    /**
 * Trim all the characters which are equal to the given character and appear at the beginning of the given string,and return the trimmed string.
 **/
public static String trimLeadingCharacter(String str,char leadingCharacter){
		if(str==null) return null;
		int index=str.indexOf(leadingCharacter);
		return (index==-1)?str:str.substring(index);
	}
}