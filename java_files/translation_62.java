import java.util.*;

public class Translation62 {
    @Override public boolean remove(Object object) {
    synchronized (mutex) {
        return c.remove(object);
    }
}
}