import java.util.*;

public class Translation167 {
    public boolean remove(Object o) {
    synchronized (mutex) {
        return delegate().remove(o);
    }
}
}