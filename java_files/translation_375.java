import java.util.*;

public class Translation375 {
    public synchronized List<E> subList(int start, int end) {
    return Collections.synchronizedRandomAccessList(list.subList(start, end), this);
}
}