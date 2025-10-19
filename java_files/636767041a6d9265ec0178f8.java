import java.util.*;

public class Generated_636767041a6d9265ec0178f8 {
    /**Copy the source string and transfer each character to lowecase.
@see #copyString(String)
@param src The source array of strings
@return A new array with all characters in lowercase
*/
private static String[] copyStrings(final String[] src) {
        final String[] dst = new String[src.length];
        for (int i=0; i<src.length; i++) {
            dst[i] = src[i].toLowerCase();
        }
        return dst;
    }
}