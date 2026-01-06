import java.util.*;

public class Generated_636766ff1a6d9265ec01784b {
    /**Check whether a character string is a dight. If yes, true is returned. Otherwise, false is returned.
@see #isDigit(char)
@since 1.0
*/
public static boolean isDigits(String str) {
        if (str == null || str.length() < 1) return false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!isDigit(c)) return false;
        }
        return true;
    }
}