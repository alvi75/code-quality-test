import java.util.*;

public class Generated_6367676b1a6d9265ec0181dd {
    public static int countOccurrencesOf(String str,String sub){
		int count = 0;
		if(str == null || sub == null) return 0;
		if(sub.length() > str.length()) return 0;
		for(int i=0;i<str.length()-sub.length()+1;i++){
			if(str.substring(i, i+sub.length()).equals(sub)) count++;
		}
		return count;
	}
}