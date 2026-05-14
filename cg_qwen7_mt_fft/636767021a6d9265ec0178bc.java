import java.util.*;

public class Generated_636767021a6d9265ec0178bc {
    public static int indexOf(String str,String searchStr){
		if(searchStr == null || str == null)
			return -1;
		
		int loc = str.indexOf(searchStr);
		if(loc >= 0 && (searchStr.length() > 0))
			loc += searchStr.length();
		return loc;
	}
}