import java.util.*;

public class Generated_6367676b1a6d9265ec0181dd {
    public static int countOccurrencesOf(String str,String sub){
		int count = 0;
		int i = str.indexOf(sub);
		while(i != -1){
			count++;
			i = str.indexOf(sub,i+sub.length());
		}
		return count;
	}
}