import java.util.*;

public class Translation23 {
    1 public void remove() {
    if (lastReturned == null)throw new IllegalStateException();
    modCount++;
    LinkedHashMap.this.remove(lastReturned.key);
    lastReturned = null;
}
}