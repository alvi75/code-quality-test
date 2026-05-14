import java.util.*;

public class Translation342 {
    public void trimToSize() {
    int s = size();
    if (s < array.length) {
        Object[] newArray = new Object[s];
        System.arraycopy(array, 0, newArray, 0, s);
        array = newArray;
        modCount++;
    }
}
}