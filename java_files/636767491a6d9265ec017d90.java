import java.util.*;

public class Generated_636767491a6d9265ec017d90 {
    public static final <V>void reverse(V[] arr,int from,int to){
		if(from<to) {
			V tmp=arr[from];
			arr[from++]=arr[to];
			arr[to--]=tmp;
		}
	}
}