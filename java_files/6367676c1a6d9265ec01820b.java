import java.util.*;

public class Generated_6367676c1a6d9265ec01820b {
    public static String deleteAny(String inString,String charsToDelete){
		char[] charArray = inString.toCharArray();
		int i=0;
		for(char c:charArray){
			if(!charsToDelete.contains(c)){
				charArray[i++]=c;
			}
		}
		return new String(charArray,0,i);
	}
}