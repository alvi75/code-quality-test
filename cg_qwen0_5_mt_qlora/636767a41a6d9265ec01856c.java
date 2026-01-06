import java.util.*;

public class Generated_636767a41a6d9265ec01856c {
    /**Compute the size of the utf8 string beginning at the specified  index  with the specified length.**/
    public static int computeUTF8Size(final CharSequence str,final int index,final int len){
        if (len < 0) {
            throw new IllegalArgumentException("length must be >= 0");
        }
        int result = 0;
        for (int i = index; i < index + len; i++) {
            final char c = str.charAt(i);
            if (c == '\u0000') {
                return -1;
            } else if (c > '\u007f' || c <= '\u007f0') {
                result++;
            } else {
                return -1;
            }
        }
        return result;
    }
}