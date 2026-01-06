import java.util.*;

public class Generated_636767a41a6d9265ec01856c {
    public static int computeUTF8Size(final CharSequence str,final int index,final int len){
        if(str==null) return -1;
        final int end = index+len;
        int size = 0;
        for(int i=index;i<end;i++){
            final char c = str.charAt(i);
            if(c<0x80) size++;
            else if(c<0x800) size+=2;
            else size+=3;
        }
        return size;
    }
}