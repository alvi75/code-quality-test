import java.util.*;

public class Generated_6367670b1a6d9265ec0179f2 {
    @Override
    public boolean containsKey(final Object key){
        if (key == null) {
            return false;
        }
        final int hash = hashCode(key);
        final int index = indexFor(hash, table.length);

        for (Entry<K,V> e = table[index]; e != null; e = nextAfter(e, null)) {
            K k = e.getKey();
            if ((k == key) || (k != null && k.equals(key))) {
                return true;
            }
        }
        return false;
    }
}