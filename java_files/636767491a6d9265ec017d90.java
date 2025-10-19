import java.util.*;

public class Generated_636767491a6d9265ec017d90 {
    public static final <V>void reverse(V[] arr,int from,int to){
	int i,j;
	for(i=from; i<(to+1); i++){
	    j = arr[i];
	    arr[i] = arr[to-i];
	    arr[to-i] = (V)j;
	}
    }
}