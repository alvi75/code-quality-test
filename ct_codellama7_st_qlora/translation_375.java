import java.util.*;

public class Translation375 {
    @Override public List<E> subList(int start, int end) {
    return new SynchronizedRandomAccessList<E>(list.subList(start, end), mutex);
}
}