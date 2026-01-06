import java.util.*;

public class Translation375 {
    ublic List<E> subList(int start, int end) {
    synchronized (mutex) {
        return new SynchronizedRandomAccessList<E>(list.subList(start, end), mutex);
    }
}
}