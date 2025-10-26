import java.util.*;

public class Translation521 {
    public void add(final int location, final E object) {
    if (location >= 0 && location <= size()) {
        final Link<E> link = voidLink;
        if (location < (size() / 2)) {
            for (int i = 0;
            i <= location;
            i++) {
                link = link.next;
            }
        }
        else {
            for (int i = size();
            i > location;
            i--) {
                link = link.previous;
            }
        }
        final Link<E> previous = link.previous;
        final Link<E> newLink = new Link<>(object, previous, link);
        previous.next = newLink;
        link.previous = newLink;
        size++;
        modCount++;
    }
    else {
        throw new IndexOutOfBoundsException();
    }
}
}