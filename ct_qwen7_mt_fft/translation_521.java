import java.util.*;

public class Translation521 {
    public void add(int index, T object) {
    if (index == size) {
        add(object);
    }
    else if (index < 0 || size < index) {
        throw new IndexOutOfBoundsException(String.valueOf(index));
    }
    else {
        LinkedHashMapEntry<T> entry = createEntry(object);
        LinkedHashMapEntry<T>[] tab = table;
        int idx = index & (tab.length - 1);
        entry.next = tab[idx];
        tab[idx] = entry;
        if (++size * loadFactor > tab.length) resize(tab.length << 1);
    }
}
}