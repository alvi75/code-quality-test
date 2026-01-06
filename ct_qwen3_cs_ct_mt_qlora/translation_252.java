import java.util.*;

public class Translation252 {
    2 public E pollLast() {
    Map.Entry<E, Object> entry = backingMap.pollLastEntry();
    return (entry == null) ? null : entry.getKey();
}
}