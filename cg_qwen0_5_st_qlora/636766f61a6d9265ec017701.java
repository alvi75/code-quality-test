import java.util.*;

public class Generated_636766f61a6d9265ec017701 {
    public static int lastIndexOf(String str,String searchStr){
		if(str==null || searchStr==null) return -1;
		int len = str.length();
		for(int i=len-1;i>=0;i--){
			if(searchStr.equals(str.substring(i,i+searchStr.length()))){
				return i;
			}
		}
		return -1;
	}
}