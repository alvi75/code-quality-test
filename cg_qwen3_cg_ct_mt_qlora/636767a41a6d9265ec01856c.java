import java.util.*;

public class Generated_636767a41a6d9265ec01856c {
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
                // Surrogates are not valid UTF-8 characters.
                throw new IllegalArgumentException("Invalid surrogate character: " + c);
            } else if (c <= 0xFFFF) {
                size += 3;
            } else {
                size += 4;
            }
        }
        return size;
    }
}