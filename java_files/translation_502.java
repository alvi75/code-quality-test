import java.util.*;

public class Translation502 {
    1 public Iterator<E> iterator() {
    final Object[] snapshot = elements;
    return new Iterator<E>() {
        int index = 0;
        E lastReturned = null;
        public boolean hasNext() {
            return index < snapshot.length;
        }
        public E next() {
            if (!hasNext())throw new NoSuchElementException();
            lastReturned = (E) snapshot[index++];
            return lastReturned;
        }
        public void remove() {
            if (lastReturned == null)throw new IllegalStateException();
            synchronized (CopyOnWriteArrayList.this) {
                if (elements == snapshot)throw new ConcurrentModificationException();
                if (index <= 0)throw new IndexOutOfBoundsException();
                System.arraycopy(elements, index - 1, elements, index - 2, --size - (index - 1));
                elements[--size] = null;
            }
            index--;
            lastReturned = null;
        }
    }
    ;
}
}