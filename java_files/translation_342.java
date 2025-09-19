import java.util.*;

public class Translation342 {
    public void trimToSize() {
    final int s = size();
    if (s == array.length) {
        return;
    }
    if (s == 0) {
        @SuppressWarnings("unchecked")Object[] newArray = EmptyArray.OBJECT;
        System.arraycopy(array, 0, newArray, 0, s);
        array = newArray;
    }
    else {
        Object[] newArray = new Object[s];
        System.arraycopy(array, 0, newArray, 0, s);
        array = newArray;
    }
    modCount++;
}
}