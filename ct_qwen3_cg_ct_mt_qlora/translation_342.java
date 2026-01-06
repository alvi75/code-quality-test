import java.util.*;

public class Translation342 {
    ublic void trimToSize() {
    final int s = size;
    if (s == array.length) {
        return;
    }
    if (s == 0) {
        array = EmptyArray.OBJECT;
    }
    else {
        final Object[] newArray = new Object[s];
        System.arraycopy(array, 0, newArray, 0, s);
        array = newArray;
    }
    modCount++;
}
}