import java.util.*;

public class Generated_6367670b1a6d9265ec0179f2 {
    @Override
    public boolean containsKey(final Object key){
        if(key == null)
            return false;
        final int hash = key.hashCode();
        final int index = indexFor(hash);
        for(int i = 0; i < 4; i++){
            final Entry<K,V> entry = table[index];
            if(entry != null && entry.hash == hash && key.equals(entry.key))
                return true;
            index = nextIndex(index, 4);
        }
        return false;
    }
}