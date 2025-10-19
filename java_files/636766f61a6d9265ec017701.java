import java.util.*;

public class Generated_636766f61a6d9265ec017701 {
    public static int lastIndexOf(String str,String searchStr){
		if(str.length()==0) return INDEX_NOT_FOUND;
		
		int lastIndex = -1;
		for(int i=str.length()-searchStr.length();i>=0;i--){
			boolean found = true;
			for(int j=0;j<searchStr.length();j++){
				if(str.charAt(i+j)!=searchStr.charAt(j)){
					found = false;
					break;
				}
			}
			if(found){
				lastIndex = i;
				break;
			}
		}
		return lastIndex;
	}
}