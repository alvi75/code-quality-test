import java.util.*;

public class Translation342 {
    1 public final void trimToSize() {
    2 int s = size;
    3 if (s < array.length) {
        4 Object[] newArray = new Object[s];
        5 System.arraycopy(array, 0, newArray, 0, s);
        6 array = newArray;
        7 modCount++;
        8 }
    }
}