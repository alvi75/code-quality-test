import java.util.*;

public class Generated_6367676c1a6d9265ec01820b {
    /**Delete characters that exists in the intersection between two character strings of the first character string and return the first character string that is modified.**/
	public static String deleteAny(String inString,String charsToDelete){
		if(inString==null||charsToDelete==null) return inString;
		int strLength=inString.length();
		int charCount=charsToDelete.length();
		for(int i=0;i<strLength;){
			char c=inString.charAt(i);
			boolean isDeleted=false;
			for(int j=0;j<charCount;j++){
				if(c==charsToDelete.charAt(j)){
					isDeleted=true;break;
				}
			}
			if(isDeleted)
				inString=inString.substring(0,i)+inString.substring(i+1,strLength);
			else i++;
			strLength=inString.length();
		}
		return inString;
	}
}