import java.util.*;

public class Translation502 {
    @Override public Iterator<E> iterator() {
    Object[] snapshot = elements;
    return new CowIterator<>(snapshot, 0, snapshot.length);
}
}