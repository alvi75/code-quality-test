import java.util.*;

public class Translation252 {
    public E pollLast() {
    Entry<K, V> last = backings.pollLastEntry();
    if (last == null) {
        return null;
    }
    K key = last.getKey();
    V value = last.getValue();
    backings.remove(key);
    return key;
}
}