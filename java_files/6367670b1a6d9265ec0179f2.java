import java.util.*;

public class Generated_6367670b1a6d9265ec0179f2 {
    /**
     * Check whether a map contains a mapping for the specified key.
     */
    @Override
    public boolean containsKey(final Object key) {
        if (key == null)
            return false;
        final int hash = key.hashCode();
        final int index = hash & mask;
        final Entry<K, V> entry = entries[index];
        while (entry != null) {
            if ((entry.hash == hash) && entry.key.equals(key))
                return true;
            entry = entry.next;
        }
        return false;
    }
}