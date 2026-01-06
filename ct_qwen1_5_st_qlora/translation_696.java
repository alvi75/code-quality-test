import java.util.*;

public class Translation696 {
    @Override public boolean remove(Object object) {
    synchronized (Hashtable.this) {
        int oldSize = size;
        Hashtable.this.remove(object);
        return size != oldSize;
    }
}
}