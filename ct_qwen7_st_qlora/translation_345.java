import java.util.*;

public class Translation345 {
    public int[] toArray() {
    if (size > array.length) {
        throw new IllegalStateException("Size is " + size + ", array length is " + array.length);
    }
    System.arraycopy(array, 0, new int[size], 0, size);
    return array;
}
}