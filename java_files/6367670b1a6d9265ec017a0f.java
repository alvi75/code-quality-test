import java.util.*;

public class Generated_6367670b1a6d9265ec017a0f {
    public static boolean containsAnyIgnoreCase(String str,List<String> searchStrArray){
		if(str==null || searchStrArray==null || searchStrArray.size()==0)
			return false;
		
		for(String s:searchStrArray){
			if(containsIgnoreCase(str,s))
				return true;
		}
		return false;
	}
}