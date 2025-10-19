import java.util.*;

public class Generated_6367670b1a6d9265ec0179f2 {
    @Override
    public boolean containsKey(final Object key){
        if (key == null) {
            return false;
        }
        final MapEntry<K, V> entry = getEntry(key);
        return entry != null;
    }
}