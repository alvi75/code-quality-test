import java.util.*;

public class Translation342 {
    public void trimToSize() {
    final int s = size;
    if (s == array.length) {
        return;
    }
    if (s == 0) {
        array = EMPTY_ARRAY;
    }
    else {
        Object[] newArray = Arrays.copyOf(array, s);
        array = newArray;
        modCount++;
    }
}
}