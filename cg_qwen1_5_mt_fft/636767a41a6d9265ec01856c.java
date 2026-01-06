import java.util.*;

public class Generated_636767a41a6d9265ec01856c {
    public static int computeUTF8Size(final CharSequence str,final int index,final int len){
		int ret=0;
		for(int i=index;i<index+len;++i)ret+=str.charAt(i)<128?1:UTF8.countUtf8Byte(str.charAt(i));
		return ret;
	}
}