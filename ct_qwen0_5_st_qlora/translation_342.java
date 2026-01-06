import java.util.*;

public class Translation342 {
    public void trimToSize() {
    int s = size;
    if (s == array.length) return;
    if (s == 0) {
        array = EMPTY_ARRAY;
    }
    else {
        object[] newArray = new object[s];
        System.arraycopy(array, 0, newArray, 0, s);
        array = newArray;
    }
    modCount++;
}
}