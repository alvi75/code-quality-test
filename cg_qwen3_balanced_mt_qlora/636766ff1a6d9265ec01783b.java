import java.util.*;

public class Generated_636766ff1a6d9265ec01783b {
    /**Get a substring from the specified String avoiding exceptions. **/
	public static String sub(String str,int start,int end){
		if(str==null) return null;
		int len = str.length();
		if(start<0 || start>=len) return "";
		if(end<start) return "";
		if(end>len) return str.substring(start);
		return str.substring(start,end);
	}
}