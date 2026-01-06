import java.util.*;

public class Translation697 {
    public E last() {
    Entry<E> entry = endpoint(false);
    if (entry == null)throw new NoSuchElementException();
    return entry.getElement();
}
}