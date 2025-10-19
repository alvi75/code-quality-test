import java.util.*;

public class Generated_6367670b1a6d9265ec0179f2 {
    @Override
    public boolean containsKey(final Object key) {
        if (key == null)
            return false;
        final int hash = key.hashCode();
        final int index = indexOf(hash);
        if (index < 0)
            return false;
        final Entry<K,V> e = table[index];
        if (e == null)
            return false;
        else if (e.hash == hash && ((K) e.key).equals(key))
            return true;
        else if (e instanceof TreeNode)
            return ((TreeNode<K, V>) e).containsKey(key);
        else
            return false;
    }
}