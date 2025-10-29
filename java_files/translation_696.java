import java.util.*;

public class Translation696 {
    public boolean remove(Object o) {
    synchronized (CopyOnWriteArrayList.this) {
        if (_size == _copy.size()) {
            return false;
        }
        _size--;
        Object[] newElements = new Object[_copy.size()];
        System.arraycopy(_copy.elements(), 0, newElements, 0, _copy.size());
        newElements[_size] = o;
        _copy.setElements(newElements);
        return true;
    }
}
}