import java.util.*;

public class Generated_6367676b1a6d9265ec0181e9 {
    public static boolean substringMatch(CharSequence str,
                                         int index,
                                         CharSequence substring) {
        for (int j = 0; j < substring.length(); j++) {
            int si = index + j;
            if (si >= str.length() || str.charAt(si) != substring.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}