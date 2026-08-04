import java.util.*;

public class Generated_636766ff1a6d9265ec01783b {
    public static String sub(String str,int start,int end){
		if(str==null) return null;
		if(start<0) start=0;
		if(end<0) end=str.length();
		if(end>str.length()) end=str.length();
		if(start>end) return "";
		return str.substring(start,end);
	}
}