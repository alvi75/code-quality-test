import java.util.*;

public class Generated_636766ff1a6d9265ec01783b {
    public static String sub(String str,int start,int end){
		if(str==null || str.length()<start)
			return "";
		
		int len=str.length();
		if(end>len)
			end=len;
		
		return str.substring(start,end);
	}
}