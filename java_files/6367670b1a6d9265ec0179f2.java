import java.util.*;

public class Generated_6367670b1a6d9265ec0179f2 {
    @Override
    public boolean containsKey(final Object key){
        if(key == null) return false;
        final int hash = hashCode(key);
        final int index = lookup(hash);
        // check bucket first
        Entry entry = table[index];
        while (entry != null && !entry.isValid()) {
            entry = entry.next;
        }
        if (entry != null && entry.hashCode == hash && entry.key.equals(key)) {
            return true;
        }
        // check rest of the chain
        while (entry != null) {
            if (entry.hashCode == hash && entry.key.equals(key)) {
                return true;
            }
            entry = entry.next;
        }
        return false;
    }
}