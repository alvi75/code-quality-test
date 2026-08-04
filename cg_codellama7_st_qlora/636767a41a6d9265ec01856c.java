import java.util.*;

public class Generated_636767a41a6d9265ec01856c {
    public static int computeUTF8Size(final CharSequence str,final int index,final int len){
        int size=0;
        for(int i=index;i<index+len;i++){
            final char c=str.charAt(i);
            if(c<0x80){
                size++;
            }else if(c<0x800){
                size+=2;
            }else if(c<0xd800||c>=0xe000){
                size+=3;
            }else{
                size+=4;
            }
        }
        return size;
    }
}