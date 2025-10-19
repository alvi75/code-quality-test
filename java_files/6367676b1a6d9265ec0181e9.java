import java.util.*;

public class Generated_6367676b1a6d9265ec0181e9 {
    public static boolean substringMatch(CharSequence str,int index,CharSequence substring){
        int len = substring.length();
        if (index+len > str.length())return false;
        for (int i=0;i<len;i++){
            if (str.charAt(index+i) != substring.charAt(i))return false;
        }
        return true;
    }
}