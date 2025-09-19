import java.util.*;

public class Translation62 {
    public boolean remove(Object o) {
    synchronized (mutex) {
        return delegate().remove(o);
    }
}
}