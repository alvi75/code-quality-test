import java.util.*;

public class Translation252 {
    1 public E pollLast() {
    2 final Map.Entry<E, Object> entry = backingMap.pollLastEntry();
    3 return (entry == null) ? null : entry.getKey();
}
}