import java.util.*;

public class Translation696 {
    1 public boolean remove(Object o) {
    synchronized (Hashtable.this) {
        int oldSize = size;
        Hashtable.this.remove(o);
        return size != oldSize;
    }
}
}