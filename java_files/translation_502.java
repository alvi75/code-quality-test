import java.util.*;

public class Translation502 {
    public Iterator<E> iterator() {
    Object[] snapshot = elements;
    return new Iterator<E>() {
        private int index = 0;
        private final Object[] array = snapshot;
        private final int size = snapshot.length;
        while (index < size) {
            E element = array[index++];
            add(element);
        }
        return this;
    }
}
}