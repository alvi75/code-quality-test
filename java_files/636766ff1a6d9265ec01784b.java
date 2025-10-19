import java.util.*;

public class Generated_636766ff1a6d9265ec01784b {
    /**Check whether a character string is a dight. If yes, true is returned. Otherwise, false is returned.**/
    public static boolean isDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }
}