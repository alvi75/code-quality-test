import java.util.*;

public class Translation375 {
    public synchronized List<E> subList(final int start, final int end) {
    return new SynchronizedRandomAccessList<E>(list.subList(start, end));
}
}