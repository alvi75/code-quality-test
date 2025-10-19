import java.util.*;

public class Generated_636767021a6d9265ec0178bc {
    /**
 * Return the first index of the searchStr in the given string.
**/
public static int indexOf(String str,String searchStr){
		int i = 0;
		while(i < str.length()){
			if(str.charAt(i) == searchStr.charAt(0)){
				if(str.substring(i).indexOf(searchStr) == 0)
					return i;
			}
			i++;
		}
		return -1;
	}
}