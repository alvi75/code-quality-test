import java.util.*;

public class Translation252 {
    public E pollLast() {
    Entry<E, Object> entry = backingMap.removeLastEntry();
    return (entry == null) ? null : entry.getKey();
}
}