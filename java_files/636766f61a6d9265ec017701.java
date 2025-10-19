import java.util.*;

public class Generated_636766f61a6d9265ec017701 {
    /**
 * Find the last index of the searchStr in str, and return INDEXNOTFOUND if str is empty.
**/
public static int lastIndexOf(String str,String searchStr){
		if(str==null || searchStr==null) return INDEXNOTFOUND;
		int len = str.length();
		int slen = searchStr.length();
		if(slen==0) return len-1;
		if(len<slen) return INDEXNOTFOUND;
		int i = len-slen;
		while(i>=0){
			if(str.regionMatches(true,i,searchStr,0,slen)) return i;
			i--;
		}
		return INDEXNOTFOUND;
	}
}