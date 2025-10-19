import java.util.*;

public class Generated_636766f61a6d9265ec017701 {
    public static int lastIndexOf(String str,String searchStr){
		if(searchStr==null || searchStr.length()==0)	return -1;
		
		int pos=str.lastIndexOf(searchStr);
		while(pos!=-1 && pos>0){
			pos=pos-1;
			if(str.charAt(pos)!=searchStr.charAt(0))return -1;
		}
		return pos;
	}
}