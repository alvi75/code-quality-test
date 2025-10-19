import java.util.*;

public class Generated_636767491a6d9265ec017d90 {
    /**Reverse the order of the given elements in the specified range.
@see #reverse(int, int)
@param arr The array containing the elements to be reversed.
@param from The index of the first element to be reversed (inclusive).
@param to The index of the last element to be reversed (exclusive).
@since 1.0
*/
@SuppressWarnings("unchecked")
public static final <V>void reverse(V[] arr,int from,int to){
if(from<to) {
int i=from,j=to-1;
while(i<j) {
V tmp=(V)arr[i];
arr[i]=(V)arr[j];
arr[j]=tmp;
i++;
j--;
}
}
}
}