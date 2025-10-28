import java.util.*;

public class Translation375 {
    2 public List<E> subList(int start, int end) {
    synchronized (mutex) {
        return new Collections.SynchronizedRandomAccessList<E>(list.subList(start, end), mutex);
    }
}
}