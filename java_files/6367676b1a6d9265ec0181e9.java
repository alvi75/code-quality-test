import java.util.*;

public class Generated_6367676b1a6d9265ec0181e9 {
    public static boolean substringMatch(CharSequence str,int index,CharSequence substring) {
        int len = Math.min(str.length(),substring.length());
        for(int i=0;i<len;i++){
            if(str.charAt(i+index)!=substring.charAt(i)){
                return false;
            }
        }
        return true;
    }
}