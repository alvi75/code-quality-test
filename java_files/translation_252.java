import java.util.*;

public class Translation252 {
    public E pollLast() {
    Entry<E, Object> entry = backingMap.pollLastEntry();
    if (entry == null) {
        return null;
    }
    else {
        return entry.getKey();
    }
}
}