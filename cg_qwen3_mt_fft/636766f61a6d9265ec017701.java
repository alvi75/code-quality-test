import java.util.*;

public class Generated_636766f61a6d9265ec017701 {
    public static int lastIndexOf(String str,String searchStr){
		if(str==null || searchStr==null)
			return -1;
		int idx = str.lastIndexOf(searchStr);
		if(idx!=-1)
			return idx;
		else
			return INDEXNOTFOUND;
	}
}