import java.util.*;

public class Translation252 {
    public E pollLast() {
    java.util.MapClass.Entry<E, Object> entry = backingMap.pollLastEntry();
    return (entry == null) ? defaultValue : entry.getKey();
}
}