import java.util.*;

public class Translation696 {
    public synchronized boolean remove(Object o) {
    int oldSize = size();
    removeValuesForMapKey((K) o);
    return size() != oldSize;
}
}