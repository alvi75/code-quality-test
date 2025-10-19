import java.util.*;

public class Generated_6367676c1a6d9265ec01820b {
    public static String deleteAny(String inString,String charsToDelete){
		if (inString == null || charsToDelete == null)
			return inString;
		
		char[] chars = inString.toCharArray();
		char[] charsToBeDeleted = charsToDelete.toCharArray();
		int len = charsToBeDeleted.length;
		for (int i=0;i<len;i++){
			for (int j=0;j<chars.length;j++){
				if (chars[j] == charsToBeDeleted[i])
					inString = inString.substring(0,j) + inString.substring(j+1);
			}
		}
		return inString;
	}
}