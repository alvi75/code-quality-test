import java.util.*;

public class Translation502 {
    1 public Iterator<E> iterator() {
    final Object[] snapshot = elements;
    return new Iterator<E>() {
        int cursor = 0;
        final int sizeRef = snapshot.length;
        @SuppressWarnings("unchecked")E[] block = (E[]) snapshot;
        public boolean hasNext() {
            return cursor < sizeRef;
        }
        public E next() {
            if (cursor >= sizeRef)throw new NoSuchElementException();
            return block[cursor++];
        }
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    ;
}
}