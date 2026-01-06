import java.util.*;

public class Generated_636767691a6d9265ec0181a7 {
    public static String trimLeadingCharacter(String str,char leadingCharacter){
		if(str==null || str.length()==0)	return str;
		
		int index=str.indexOf(leadingCharacter);
		if(index==-1)	return str; //nothing to remove
		return str.substring(index+1);
	}
}