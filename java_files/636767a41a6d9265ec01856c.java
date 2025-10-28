import java.util.*;

public class Generated_636767a41a6d9265ec01856c {
    public static int computeUTF8Size(final CharSequence str,final int index, final int len) {
        if (len < 0 || index + len > str.length()) {
            throw new IllegalArgumentException("Invalid UTF-8 string: " + str);
        }
        int size = 1;
        for (int i = index; i < index + len; ++i) {
            char c = str.charAt(i);
            if ((c & 0xE0) == 0xC0) {
                size += 2;
            } else if ((c & 0xF0) == 0xE0) {
                size += 3;
            } else if ((c & 0xF8) == 0xF0) {
                size += 4;
            } else if ((c & 0xF8) == 0xF8) {
                size += 5;
            } else {
                return -1;
            }
        }
        return size;
    }
}