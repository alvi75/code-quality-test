import java.util.*;

public class Translation342 {
    public void trimToSize() {
    final int s = size();
    if (s == capacity()) {
        return;
    }
    if (s == 0) {
        array = EMPTY_ARRAY;
    }
    else {
        Object[] newArray = new Object[s];
        System.arraycopy(array, 0, newArray, 0, s);
        array = newArray;
        modCount++;
    }
}
}