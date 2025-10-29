import java.util.*;

public class Generated_636767a41a6d9265ec01856c {
    /**Compute the size of the utf8 string beginning at the specified  index  with the specified length.**/
    public static int computeUTF8Size(final CharSequence str,final int index,final int len){
        if (len < 0) {
            throw new IllegalArgumentException("The length must be a non-negative integer.");
        }
        if (index < 0 || index + len > str.length()) {
            throw new IllegalArgumentException("The index must be a valid position in the CharSequence.");
        }
        return computeUTF8Size(str, index, len, false);
    }
}