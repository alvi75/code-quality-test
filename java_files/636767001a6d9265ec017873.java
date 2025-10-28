import java.util.*;

public class Generated_636767001a6d9265ec017873 {
    public static String reverse(final String str) {
        final char[] chars = str.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; ++i, --j)
            swap(chars, i, j);
        return new String(chars);
    }
}