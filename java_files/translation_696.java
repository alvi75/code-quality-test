import java.util.*;

public class Translation696 {
    @Override public boolean remove(Object key) {
    if (!contains(key)) {
        return false;
    }
    removeFromBothMaps(key);
    return true;
}
}