import java.util.*;

public class Generated_6367676b1a6d9265ec0181e9 {
    public static boolean substringMatch(CharSequence str,int index,CharSequence substring){
        int subLen = substring.length();
        for (int j = 0; j < subLen; j++) {
            if (index + j >= str.length() || str.charAt(index + j) != substring.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}