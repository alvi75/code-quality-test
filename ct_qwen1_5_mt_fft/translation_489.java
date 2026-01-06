import java.util.*;

public class Translation489 {
    public void clear() {
    modCount++;
    size = 0;
    for (int i = elements.length - 1;
    i > 0;
    i--) {
        elements[i] = null;
    }
    tail = head = 0;
}
}