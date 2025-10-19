import java.util.*;

public class Generated_6367676b1a6d9265ec0181dd {
    /**
 * Return the frequencies that the substring appears in the string.
 **/
public static int countOccurrencesOf(String str,String sub){
        if(str==null || sub==null) return 0;
        int count = 0;
        for(int i=0;i<=str.length()-sub.length();i++){
            if(str.substring(i,i+sub.length()).equals(sub)) count++;
        }
        return count;
    }
}