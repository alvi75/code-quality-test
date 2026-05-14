import java.util.*;

public class Generated_6367676b1a6d9265ec0181dd {
    /**Return the frequencies that the substring appears in the string.**/
	public static int countOccurrencesOf(String str,String sub){
		int count = 0;
		int index = str.indexOf(sub);
		while(index != -1){
			count++;
			index = str.indexOf(sub, index+1);
		}
		return count;
	}
}