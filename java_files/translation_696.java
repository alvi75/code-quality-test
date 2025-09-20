import java.util.*;

public class Translation696 {
    @Override public boolean remove(Object key) {
    synchronized (Hashtable.this) {
        int oldSize = size;
        Hashtable.this.remove(key);
        return size != oldSize;
    }
}
}