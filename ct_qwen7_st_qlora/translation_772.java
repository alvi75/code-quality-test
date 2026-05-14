import java.util.*;

public class Translation772 {
    public static String decode(String s) {
    if (s == null)return null;
    int len = s.length();
    char[] array = new char[len];
    for (int i = 0;
    i < len;
    ) {
        char c = s.charAt(i++);
        switch (c) {
            case '+':array[i - 1] = ' ';
            break;
            case '%':if (i + 2 > len)throw new IllegalArgumentException("Incomplete %xx escape");
            try {
                array[i - 1] = (char)Integer.parseInt(s.substring(i, i + 2), RADIX_16);
            }
            catch (NumberFormatException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
            i += 2;
            break;
            default:array[i - 1] = c;
            break;
        }
    }
    return new String(array);
}
}