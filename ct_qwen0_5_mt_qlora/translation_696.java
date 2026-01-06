import java.util.*;

public class Translation696 {
    public synchronized boolean remove(Object o) {
    int oldSize = size;
    try {
        list.remove(o);
    }
    catch (Exception e) {
        throw new RuntimeException(e);
    }
    if (oldSize == size) {
        return false;
    }
    else {
        return true;
    }
}
}