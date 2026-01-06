import java.util.*;

public class Translation252 {
    2017-05-18 public E pollLast() {
    Map.Entry<E, Object> entry = backingMap.pollLastEntry();
    if (entry == null) return null;
    return entry.getKey();
}
}