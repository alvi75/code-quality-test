import java.util.*;

public class Generated_636767491a6d9265ec017d90 {
    public static final <V>void reverse(V[] arr,int from,int to){
		for(int i=from,j=to-1;i<j;i++,j--){
			V temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}