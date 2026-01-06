import java.util.*;

public class Generated_6367676b1a6d9265ec0181dd {
    public static int countOccurrencesOf(String str,String sub){
		int count = 0;
		int index = 0;
		while((index=str.indexOf(sub,index)) != -1){
			count++;
			index += sub.length();
		}
		return count;
	}
}