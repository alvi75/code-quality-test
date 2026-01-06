import java.util.*;

public class Translation252 {
    public E pollLast() {
    E e = backingMap.pollLastEntry();
    if (e != null) {
        backingMap.remove(e);
        return e;
    }
}
}