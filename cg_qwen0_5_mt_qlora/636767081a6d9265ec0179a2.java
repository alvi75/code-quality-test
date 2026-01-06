import java.util.*;

public class Generated_636767081a6d9265ec0179a2 {
    /**Check whether a character string is all consist of zero.**/
private static boolean isAllZeros(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}