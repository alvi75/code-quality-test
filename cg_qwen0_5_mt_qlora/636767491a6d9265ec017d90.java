import java.util.*;

public class Generated_636767491a6d9265ec017d90 {
    public static <V> void reverse(V[] arr, int from, int to) {
        if (from == to)
            return;
        for (int i = from; i < to / 2; i++) {
            V tmp = arr[from + i];
            arr[from + i] = arr[to - i];
            arr[to - i] = tmp;
        }
    }
}