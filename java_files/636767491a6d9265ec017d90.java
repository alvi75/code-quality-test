import java.util.*;

public class Generated_636767491a6d9265ec017d90 {
    public static final <V>void reverse(V[] arr,int from, int to) {reverse(arr, from, to, false);}
/**
Reverse the order of the given elements in the specified range.
@param arr array to reverse
@param from index of first element (inclusive)
@param to index of last element (exclusive)
@param reverse true if the elements should be reversed
@return the number of elements reversed
@since 1.0 */
public static final <V>int reverse(V[] arr, int from, int to, boolean reverse) {
    int len = to - from;
    for(int i = 0; i < len / 2; i++) {
      V tmp = arr[from + i];
      arr[from + i] = arr[to - i - 1];
      arr[to - i - 1] = tmp;
    }
    return len;
  }
}