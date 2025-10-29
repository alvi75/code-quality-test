import java.util.*;

public class Generated_636767a41a6d9265ec01856c {
    /**Compute the size of the utf8 string beginning at the specified  index  with the specified length.*/
    public static int computeUTF8Size(final CharSequence str,final int index,final int len){
        final int end = index + len;
        int size = 0;
        for (int i = index; i < end; ++i) {
            final char c = str.charAt(i);
            if (c <= 0x7F) {
                size += 1;
            } else if (c <= 0x7FF) {
                size += 2;
            } else if (Character.isHighSurrogate(c)) {
                // surrogate pair
                if (i + 1 >= end || !Character.isLowSurrogate(str.charAt(i + 1))) {
                    throw new IllegalArgumentException("Invalid surrogate pair: " + c + ", " + str.charAt(i + 1));
                }
                size += 4;
                ++i;
            } else {
                size += 3;
            }
        }
        return size;
    }
}