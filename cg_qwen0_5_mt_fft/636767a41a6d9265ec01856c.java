import java.util.*;

public class Generated_636767a41a6d9265ec01856c {
    /**Compute the size of the utf8 string beginning at the specified  index  with the specified length.**/ 
    public static int computeUTF8Size(final CharSequence str,final int index,final int len){
        if (index < 0 || index > str.length()) {
            throw new IndexOutOfBoundsException("Index " + index + " is not within the valid range [0.." + (str.length() - 1) + "]"); //$NON-NLS-1$//$NON-NLS-2$
        }
        final int result = computeUTF8Size(str, index);
        if (result <= len) {
            return result;
        } else {
            // We can't do better than to just use a copy.
            return len;
        }
    }
}