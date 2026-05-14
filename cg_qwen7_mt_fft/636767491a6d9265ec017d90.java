import java.util.*;

public class Generated_636767491a6d9265ec017d90 {
    public static final <V>void reverse(V[] arr,int from,int to){
		if(from==to)
			return;
		int len=arr.length;
		if(from<0 || to>len || from>=to)
			throw new IndexOutOfBoundsException("from="+from+", to="+to+", len="+len);
		
		for(int i=from,j=to-1;i<j;i++,j--){
			V tmp=arr[i];
			arr[i]=arr[j];
			arr[j]=tmp;
		}
	}
}