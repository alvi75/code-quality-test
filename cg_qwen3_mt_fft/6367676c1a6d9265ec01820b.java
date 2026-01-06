import java.util.*;

public class Generated_6367676c1a6d9265ec01820b {
    public static String deleteAny(String inString,String charsToDelete){
		String result = "";
		for (int i=0;i<inString.length();i++){
			char c = inString.charAt(i);
			if (!charsToDelete.contains(c)){
				result += c;
			}
		}
		return result;
	}
}