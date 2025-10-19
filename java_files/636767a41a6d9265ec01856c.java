import java.util.*;

public class Generated_636767a41a6d9265ec01856c {
    /**Compute the size of the utf8 string beginning at the specified  index  with the specified length.
@see #computeUTF8Size(CharSequence, int)
*/
public static int computeUTF8Size(final CharSequence str,final int index,final int len){
        return computeUTF8Size(str.subSequence(index,len).toString());
    }
}