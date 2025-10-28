import java.util.*;

public class Generated_636767491a6d9265ec017d90 {
    public static final <V>void reverse(V[] arr, int from, int to) {
        for (int i = from; i < to / 2; i++) {
            V tmp = arr[i];
            arr[i] = arr[to - i - 1];
            arr[to - i - 1] = tmp;
        }
    }
}