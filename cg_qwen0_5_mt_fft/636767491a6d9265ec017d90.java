import java.util.*;

public class Generated_636767491a6d9265ec017d90 {
    public static final <V> void reverse(V[] arr, int from, int to) {
        if (from > to)
            throw new IllegalArgumentException("Array index out of range: " + from + " > " + to);
        for (int i = 0; i < (to - from) / 2; i++) {
            V tmp = arr[from + i];
            arr[from + i] = arr[to - i - 1];
            arr[to - i - 1] = tmp;
        }
    }
}