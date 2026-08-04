import java.util.*;

public class Translation696 {
    public boolean remove(Object o) {
    synchronized (this._enclosing) {
        int oldSize = this._enclosing._size;
        this._enclosing.remove(o);
        return this._enclosing._size != oldSize;
    }
}
}