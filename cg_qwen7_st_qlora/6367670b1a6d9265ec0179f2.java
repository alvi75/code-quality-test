import java.util.*;

public class Generated_6367670b1a6d9265ec0179f2 {
    @Override
    public boolean containsKey(final Object key){
        if (key == null) {
            return false;
        }
        final int hash = key.hashCode();
        final int index = hash % this.table.length;

        if (index < 0) {
            index *= -1;
        }

        if (this.table[index] != null && this.table[index].hashCode() == hash && this.table[index].equals(key)) {
            return true;
        } else {
            return false;
        }
    }
}