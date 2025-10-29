import java.util.*;

public class Generated_6367676b1a6d9265ec0181dd {
    public static int countOccurrencesOf(String str,String sub){
		int count = 0;
		for(int i=0;i<str.length();i++){
			if(str.substring(i).startsWith(sub)){
				count++;
			}
		}
		return count;
	}
}