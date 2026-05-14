import java.util.*;

public class Translation62 {
    public boolean remove(Object object) {
    synchronized (mutex) {
        return delegate().remove(object);
    }
}
}