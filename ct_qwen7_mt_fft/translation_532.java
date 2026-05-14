import java.util.*;

public class Translation532 {
    public E get(int index) {
    synchronized (CopyOnWriteArrayList.this) {
        slice.checkElementIndex(index);
        return slice.get(index + slice.from);
    }
}
}