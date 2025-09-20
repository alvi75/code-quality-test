import java.util.*;

public class Translation375 {
    @Override public List<E> subList(int start, int end) {
    synchronized (mutex) {
        return new SynchronizedList<E>(list.subList(start, end), mutex);
    }
}
}