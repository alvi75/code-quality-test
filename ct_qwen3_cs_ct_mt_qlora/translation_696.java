import java.util.*;

public class Translation696 {
    2 public boolean remove(Object o) {
    synchronized (mutex) {
        int oldSize = size;
        remove(o);
        return size != oldSize;
    }
}
}