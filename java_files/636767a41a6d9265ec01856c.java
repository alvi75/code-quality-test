import java.util.*;

public class Generated_636767a41a6d9265ec01856c {
    public static int computeUTF8Size(final CharSequence str,final int index,final int len){
		int size = 0;
		for(int i = index; i < index + len; i++){
			if(str.charAt(i) == '\u0000'){
				size++;
			}
		}
		return size;
	}
}