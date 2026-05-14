import java.util.*;

public class Generated_6367676b1a6d9265ec0181dd {
    public static int countOccurrencesOf(String str,String sub){
		if(str == null || sub == null || str.length() == 0 || sub.length() == 0) {
			return 0;
		}
		
		int count = 0;
		int idx = -1;
		while ((idx = str.indexOf(sub,idx)) != -1) {
			count++;
			idx += sub.length();
		}

		return count;
	}
}