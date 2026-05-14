import java.util.*;

public class Translation696 {
    public boolean remove(Object object) {
    synchronized (Hashtable.this) {
        if (containsKey(object)) {
            remove(object);
            return true;
        }
        return false;
    }
}
}