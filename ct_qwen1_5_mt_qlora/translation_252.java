import java.util.*;

public class Translation252 {
    public final E pollLast() {
    MapClass.Entry<E,Object> entry = backingMap.pollLastEntry();
    return (entry == null) ? null : entry.getKey();
}
}