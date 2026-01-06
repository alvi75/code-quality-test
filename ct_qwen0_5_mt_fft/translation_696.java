import java.util.*;

public class Translation696 {
    public boolean remove(Object o) {
    synchronized (this) {
        int oldSize = size;
        remove(o);
        return size != oldSize;
    }
}
}