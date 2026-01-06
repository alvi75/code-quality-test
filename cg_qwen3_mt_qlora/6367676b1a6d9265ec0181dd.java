import java.util.*;

public class Generated_6367676b1a6d9265ec0181dd {
    /**Return the frequencies that the substring appears in the string.*/
    public static int countOccurrencesOf(String str,String sub){
        if(str==null || sub==null) return 0;
        int count=0;
        int idx=str.indexOf(sub);
        while(idx>=0){
            count++;
            idx=str.indexOf(sub,idx+1);
        }
        return count;
    }
}