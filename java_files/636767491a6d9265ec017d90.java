import java.util.*;

public class Generated_636767491a6d9265ec017d90 {
    public static final <V>void reverse(V[] arr,int from,int to)
    {
        int i=from,j=to;
        while(i<j)
        {
            V tmp=arr[i];
            arr[i]=arr[j];
            arr[j--]=tmp;
        }
    }
}