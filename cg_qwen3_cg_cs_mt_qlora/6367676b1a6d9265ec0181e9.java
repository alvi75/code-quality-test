import java.util.*;

public class Generated_6367676b1a6d9265ec0181e9 {
    public static boolean substringMatch(CharSequence str,int index,CharSequence substring){
        int length = substring.length();
        for(int i=0;i<length;i++){
            if(str.charAt(index+i)!=substring.charAt(i)){
                return false;
            }
        }
        return true;
    }
}