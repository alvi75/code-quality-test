import java.util.*;

public class Generated_636767a41a6d9265ec01856c {
    /**
 * Compute the size of the utf8 string beginning at the specified  index  with the specified length.
 */
public static int computeUTF8Size(final CharSequence str,final int index,final int len){
        final int end = index + len;
        int size = 0;
        for (int i = index; i < end; i++) {
            final char c = str.charAt(i);
            if (c <= 0x7F) {
                size++;
            } else if (c <= 0x7FF) {
                size += 2;
            } else if (Character.isHighSurrogate(c)) {
                // A low surrogate follows this high surrogate.
                if (i + 1 == end) {
                    throw new IllegalArgumentException("Invalid UTF-8 string: no following low surrogate.");
                }
                final char c2 = str.charAt(++i);
                if (!Character.isLowSurrogate(c2)) {
                    throw new IllegalArgumentException("Invalid UTF-8 string: invalid low surrogate.");
                }
                size += 4;
            } else {
                size += 3;
            }
        }
        return size;
    }
}