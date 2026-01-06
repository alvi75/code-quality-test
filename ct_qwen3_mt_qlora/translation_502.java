import java.util.*;

public class Translation502 {
    1 public Iterator<E> iterator() {
    Object[] snapshot = elements;
    return new CowIterator<E>(snapshot, 0, snapshot.length);
}
}