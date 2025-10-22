import java.util.*;

public class Generated_6367676b1a6d9265ec0181dd {
    public static int countOccurrencesOf(String str,String sub){
        if(str==null || sub==null) return 0;
        int count=0;
        for(int i=str.indexOf(sub);i>=0;i=str.indexOf(sub,i+1)) count++;
        return count;
    }
}