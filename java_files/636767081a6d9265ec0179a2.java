import java.util.*;

public class Generated_636767081a6d9265ec0179a2 {
    private static boolean isAllZeros(String s) {
        if (s == null || s.length() == 0)
            return true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c != '0') && (c != 'x'))
                return false;
        }
        return true;
    }
}