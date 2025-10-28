import java.util.*;

public class Generated_636767491a6d9265ec017d90 {
    /**
 * Reverse the order of the given elements in the specified range.
 */
public static final <V> void reverse(V[] arr,int from,int to){
		if(from<0||from>=arr.length)
			throw new IndexOutOfBoundsException("from="+from);
		if(to<from||to>=arr.length)
			throw new IndexOutOfBoundsException("to="+to);
		
		for(int i=from,j=to-1;i<j;++i,--j){
			V tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
	}
}