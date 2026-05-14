import java.util.*;

public class Translation167 {
    public boolean remove(Object object) {
    synchronized (mutex) {
        return delegate().remove(object);
    }
}
}