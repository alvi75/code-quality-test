import java.util.*;

public class Generated_6367676c1a6d9265ec01820b {
    public static String deleteAny(String inString,String charsToDelete){
		StringBuffer outString=new StringBuffer(inString);
		int pos=0;
		while(pos<outString.length()){
			if(charsToDelete.indexOf(outString.charAt(pos))!=-1)
				outString.deleteCharAt(pos);
			else
				pos++;
		}
		return outString.toString();
	}
}