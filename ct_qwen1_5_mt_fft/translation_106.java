import java.util.*;

public class Translation106 {
    public static String toHex(String value) {
    if (value == null || value.length() == 0)return "";
    StringBuilder sb = new StringBuilder(value.length());
    for (int i = 0;
    i < value.length();
    i++) {
        char c = value.charAt(i);
        sb.append(Character.forDigit(c >> 4 & 0xF, 16));
        sb.append(Character.forDigit(c & 0xF, 16));
    }
    return sb.toString();
}
}