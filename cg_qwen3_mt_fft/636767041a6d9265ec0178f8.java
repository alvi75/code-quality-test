import java.util.*;

public class Generated_636767041a6d9265ec0178f8 {
    /**Copy the source string and transfer each character to lowecase.**/
    private static String[] copyStrings(final String[] src) {
        final int len = src.length;
        final String[] dst = new String[len];
        for (int i = 0; i < len; i++) {
            dst[i] = src[i].toLowerCase();
        }
        return dst;
    }
}