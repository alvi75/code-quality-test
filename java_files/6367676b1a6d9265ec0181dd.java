import java.util.*;

public class Generated_6367676b1a6d9265ec0181dd {
    public static int countOccurrencesOf(String str,String sub){
        if(str==null || sub==null) return 0;
        int[] freq = new int[256];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        int count = 0;
        for(int i=0;i<sub.length();i++){
            if(freq[sub.charAt(i)]>0){
                count += freq[sub.charAt(i)];
                freq[sub.charAt(i)]--;
            }else{
                break;
            }
        }
        return count;
    }
}