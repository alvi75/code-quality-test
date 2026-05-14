import java.util.*;

public class Generated_6367670b1a6d9265ec0179f2 {
    @Override
    public boolean containsKey(final Object key) {
        if (key == null)
            return false;
        final int hash = hash(key);
        final int slot = indexOf(hash);

        // search the chain from the slot
        Node<K, V> node = table[slot];
        while (node != null) {
            if ((hash == node.hash) && equals(key, node.key))
                return true;
            node = node.next;
        }
        return false;
    }
}