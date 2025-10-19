import java.util.*;

public class Generated_636767a41a6d9265ec01856c {
    /**Compute the size of the utf8 string beginning at the specified  index  with the specified length.*/
    public static int computeUTF8Size(final CharSequence str,final int index,final int len){
        if(str==null)return -1;
        final int end=index+len;
        int i=index;
        while(i<end && (str.charAt(i) & 0x80)!=0x80)i++;
        return i-index;
    }
}