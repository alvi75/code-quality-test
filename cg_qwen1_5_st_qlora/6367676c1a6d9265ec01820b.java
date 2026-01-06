import java.util.*;

public class Generated_6367676c1a6d9265ec01820b {
    public static String deleteAny(String inString,String charsToDelete){
		if(inString==null || charsToDelete==null) return null;
		
		String strChars = "";
		for(int i=0;i<charsToDelete.length();i++){
			strChars += Character.toString(charsToDelete.charAt(i));
		}
		
		return replaceAll(inString,strChars,"");
	}
}