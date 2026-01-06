import java.util.*;

public class Translation48 {
    public E previous() {
    if (index <= start) {
        throw new NoSuchElementException();
    }
    return list.get(--index);
}
}