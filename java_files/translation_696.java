import java.util.*;

public class Translationtranslation_696 {
    public boolean remove(Object o) {
        synchronized (Hashtable.this) {
            int oldSize = size;
            Hashtable.this.remove(o);
            return size != oldSize;
        }
    }
}