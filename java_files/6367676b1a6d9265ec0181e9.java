import java.util.*;

public class Generated_6367676b1a6d9265ec0181e9 {
    public static boolean substringMatch(CharSequence str,int index,CharSequence substring){
        int len = substring.length();
        if (len > str.length()) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            char c = substring.charAt(i);
            if (!Character.equals(str.charAt(index + i),c)) {
                return false;
            }
        }
        return true;
    }
}