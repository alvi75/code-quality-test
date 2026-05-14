import java.util.*;

public class Generated_636766f61a6d9265ec017701 {
    /**Find the last index of the searchStr in str, and return INDEXNOTFOUND if str is empty.**/
	public static int lastIndexOf(String str,String searchStr){
		if(str.length() == 0) return INDEXNOTFOUND;
		int index = str.lastIndexOf(searchStr);
		return index;
	}
}