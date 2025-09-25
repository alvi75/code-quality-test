import java.util.*;

public class Translation696 {
    public boolean remove(Object o) {
    synchronized (this._enclosing) {
        final int size = this._enclosing.size();
        this._enclosing.remove(o);
        return size != this._enclosing.size();
    }
}
}