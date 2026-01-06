import java.util.*;

public class Generated_636767021a6d9265ec0178bc {
    public static int indexOf(String str,String searchStr){
		int index = 0;
		if(str == null || searchStr == null) return -1;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == searchStr.charAt(0)){
				index = i;
				break;
			}
		}
		return index;
	}
}