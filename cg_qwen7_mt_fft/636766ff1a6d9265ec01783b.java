import java.util.*;

public class Generated_636766ff1a6d9265ec01783b {
    public static String sub(String str,int start,int end){
		if(str == null || (start==end)) return "";
		
		int leng = str.length();
		if(start < 0) start = 0;
		if(end > leng) end = leng;

		return ((leng >= start)?str.substring(start):"") 
				+ ((end <= leng)?str.substring(0,end):"");
	}
}