import java.util.*;

public class Generated_6367670b1a6d9265ec0179f2 {
    @Override
    public boolean containsKey(final Object key) {
        if (key == null) {
            return false;
        }
        final int hash = getHash(key);
        final int index = getIndex(hash);

        lock.readLock().lock();
        try {
            return !isEmptySlot(index) && getKeyAtIndex(index).equals(key);
        } finally {
            lock.readLock().unlock();
        }
    }
}