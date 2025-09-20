import java.util.*;

public class Translation252 {
    public E pollLast() {
    Map.Entry<E, Object> entry = backingMap.pollLastEntry();
    return (entry == null) ? null : entry.getKey();
}
}