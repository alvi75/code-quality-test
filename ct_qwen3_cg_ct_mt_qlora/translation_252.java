import java.util.*;

public class Translation252 {
    ublic E pollLast() {
    final Map.Entry<K, V> entry = backingMap.pollLastEntry();
    return (entry == null) ? null : entry.getKey();
}
}