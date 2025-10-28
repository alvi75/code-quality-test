import java.util.*;

public class Generated_6367676b1a6d9265ec0181e9 {
    public static boolean substringMatch(CharSequence str,int index,CharSequence substring){
        int len = str.length();
        int sublen = substring.length();
        if(index+len < sublen) {return false;}
        for(int i=0;i<sublen;++i){
            if(str.charAt(i+index)!=substring.charAt(i)) {return false;}
        }
        return true;
    }
}