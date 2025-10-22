import java.util.*;

public class Generated_6367676c1a6d9265ec01820b {
    /**
 * Delete characters that exists in the intersection between two character strings of the first character string and return the first character string that is modified.
 **/
public static String deleteAny(String inString,String charsToDelete){
		if(inString==null) return null;
		if(charsToDelete==null) return inString;
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<inString.length();i++){
			char c = inString.charAt(i);
			if(!charsToDelete.contains(""+c)){
				sb.append(c);
			}
		}
		return sb.toString();
	}
}