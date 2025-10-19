import java.util.*;

public class Generated_636767491a6d9265ec017d90 {
    /**
 * Reverse the order of the given elements in the specified range.
 */
public static final <V>void reverse(V[] arr,int from,int to){
        int i = from;
        int j = to - 1;
        while(i<j){
            V tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }
}