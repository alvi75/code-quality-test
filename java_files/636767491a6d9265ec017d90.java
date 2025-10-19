import java.util.*;

public class Generated_636767491a6d9265ec017d90 {
    public static final <V>void reverse(V[] arr,int from,int to){
		int len = to-from;
		for(int i=0;i<len/2;++i){
			V tmp = arr[from+i];
			arr[from+i]=arr[to-i];
			arr[to-i]=tmp;
		}
	}
}