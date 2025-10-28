import java.util.*;

public class Generated_636766ff1a6d9265ec01784b {
    public static boolean isDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}