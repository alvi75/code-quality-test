import java.util.*;

public class Generated_6367676b1a6d9265ec0181dd {
    public static int countOccurrencesOf(String str,String sub){
		int count = 0;
		int pos = 0;
		int lastPos = 0;
		while((pos = str.indexOf(sub, pos))!= -1){
			count++;
			pos += sub.length();
			lastPos = pos;
		}
		return count;
	}
}