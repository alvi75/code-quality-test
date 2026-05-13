import java.util.*;

public class Translation252 {
    public E pollLast() {
    Entry<E> entry = backingMap.pollLastEntry();
    return (entry == null) ? null : entry.getKey();
}
}