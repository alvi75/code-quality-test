import java.util.*;

public class Generated_636767491a6d9265ec017d90 {
    /**Reverse the order of the given elements in the specified range.*/
    public static final <V>void reverse(V[] arr,int from,int to){
        if(from<0)from=arr.length+from;
        if(to<0)to+=arr.length;
        if(to<=from)return;
        while(--to>=++from)
            swap(arr,from,to);
    }
}