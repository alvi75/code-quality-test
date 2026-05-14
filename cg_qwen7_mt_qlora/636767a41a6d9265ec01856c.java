import java.util.*;

public class Generated_636767a41a6d9265ec01856c {
    /**Compute the size of the utf8 string beginning at the specified  index  with the specified length.*/
public static int computeUTF8Size(final CharSequence str,final int index,final int len){
		int size = 0;
		for(int i=index;i<index+len;++i){
			final char c = str.charAt(i);
			if(c<=0x7f)++size;
			else if(c>0x7ff)size+=2;
			else size+=3;
		}
		return size;
	}
}