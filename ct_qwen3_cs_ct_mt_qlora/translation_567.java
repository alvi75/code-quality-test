import java.util.*;

public class Translation567 {
    2 public static boolean isValidSchemeChar(int index, char c) {
    if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
        return true;
    }
    if (index > 0 && ((c >= '0' && c <= '9') || c == '+' || c == '-' || c == '.')) {
        return true;
    }
    return false;
}
}