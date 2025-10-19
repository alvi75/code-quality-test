import java.util.*;

public class Generated_636767a41a6d9265ec01856c {
    public static int computeUTF8Size(final CharSequence str,final int index,final int len){
        if (len < 0) {
            throw new IllegalArgumentException("len must be >= 0");
        }
        final int endIndex = index + len;
        int count = 0;
        for (int i = index; i < endIndex; ++i) {
            char c = str.charAt(i);
            if (c > 0x7f) {
                // UTF-8 multi-byte character.
                if (c < 0x800) {
                    // Two byte character.
                    ++count;
                } else {
                    // Three byte character.
                    ++count;
                    if (c > 0xd7ff) {
                        // Invalid or unassigned UCS-4 code point.
                        return -1;
                    }
                }
            } else {
                ++count;
            }
        }
        return count;
    }
}