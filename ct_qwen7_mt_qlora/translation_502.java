import java.util.*;

public class Translation502 {
    1 public Iterator<E> iterator() {
    2 final Object[] snapshot = elements;
    3 return new CowIterator<>(snapshot, 0, snapshot.length);
    4 }
}