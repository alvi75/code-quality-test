import java.util.*;

public class Generated_6367676b1a6d9265ec0181e9 {
    public static boolean substringMatch(CharSequence str,int index,CharSequence substring){
        if(str==null)return false;
        if(substring==null)return true;
        int len=substring.length();
        if(len>str.length()-index)return false;
        for(int i=index;i<len;i++){
            if(str.charAt(i)!=substring.charAt(i-index))return false;
        }
        return true;
    }
}