import java.util.*;

public class Translation502 {
    public Iterator<E> iterator() {
    Object[] snapshot = elements;
    return new CowIterator<>(snapshot, 0, snapshot.length);
}
}