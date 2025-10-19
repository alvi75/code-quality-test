import java.util.*;

public class Generated_6367676b1a6d9265ec0181dd {
    public static int countOccurrencesOf(String str,String sub){
		int count = 0;
		int idx = 0;
		while((idx = str.indexOf(sub, idx)) != -1){
			count++;
			idx = idx + sub.length();
		}
		return count;
	}
}