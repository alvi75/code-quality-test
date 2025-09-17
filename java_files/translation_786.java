import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class Translationtranslation_786 {
    public Long get(CharSequence key) {
        int hash = hashFunction.hash(key);
        if (hash < 0) {
            hash = hash * -1;
        }
        HashMapEntry[] tab = table;
        int index = hash & (tab.length - 1);
        for (HashMapEntry e = tab[index];
        e != null;
        e = e.next) {
            if (e.hash == hash && key.equals(e.key)) {
                return e.value;
            }
        }
        return null;
    }
}