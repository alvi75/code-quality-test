import java.util.*;

public class Translation414 {
    public int lastIndexOf(Object object) {
    final int size = size();
    Object[] elements = elementData;
    for (int i = size - 1;
    i >= 0;
    i--) {
        if (elements[i] == object) {
            return i;
        }
    }
    return -1;
}
}