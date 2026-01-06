import java.util.*;

public class Generated_6367676b1a6d9265ec0181e9 {
    /**Return true if starting at the given index,the given string matches the given substring.Otherwise return false.*/
    public static boolean substringMatch(CharSequence str,int index,CharSequence substring){
        int strLen=str.length();
        int subLen=substring.length();
        if(strLen<subLen)return false;
        if(index+subLen>strLen)return false;
        for(int i=index;i<index+subLen;++i){
            if(str.charAt(i)!=substring.charAt(i-index))return false;
        }
        return true;
    }
}