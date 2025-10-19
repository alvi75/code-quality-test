import java.util.*;

public class Generated_636767a41a6d9265ec01856c {
    public static int computeUTF8Size(final CharSequence str,final int index,final int len){
        final int end = index + len;
        int count = 0;
        for (int i = index; i < end; i++) {
            char c = str.charAt(i);
            if (c <= 0x7F) {
                count++;
            } else if (c > 0x7FF) {
                count += 3;
            } else {
                count += 2;
            }
        }
        return count;
    }
}