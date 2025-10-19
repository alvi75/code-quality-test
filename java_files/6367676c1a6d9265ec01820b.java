import java.util.*;

public class Generated_6367676c1a6d9265ec01820b {
    public static String deleteAny(String inString,String charsToDelete){
		char[] charArray=inString.toCharArray();
		for(int i=0;i<inString.length();i++){
			if(charsToDelete.indexOf(charArray[i])!=-1){
				charArray[i]=null;
			}
		}
		String outString=new String(charArray).replace("\0","");
		return outString;
	}
}