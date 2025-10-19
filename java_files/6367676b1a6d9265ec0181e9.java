import java.util.*;

public class Generated_6367676b1a6d9265ec0181e9 {
    public static boolean substringMatch(CharSequence str,int index,CharSequence substring){
        int i = index;
        final int j = 0;
        final int len1 = str.length();
        final int len2 = substring.length();

        while (i < len1) {
            char c = str.charAt(i);
            if (c != substring.charAt(j)) {
                ++i;
                continue;
            }
            ++j;
            if (++j >= len2) {
                break;
            }
        }

        return j == len2;
    }
}