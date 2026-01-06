import java.util.*;

public class Translation252 {
    ublic E pollLast() {
    Entry<E, Object> entry = backingMap.pollLastEntry();
    return (entry == null) ? null : entry.getKey();
}
}