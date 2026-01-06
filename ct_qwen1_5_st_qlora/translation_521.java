import java.util.*;

public class Translation521 {
    public void add(int location, E object) {
    if (location >= 0 && location <= size) {
        Link<E> link = voidLink;
        if (location < (size/2)) {
            for (int i=0;
            i<=location;
            i++) {
                link = link.next;
            }
        }
        else {
            for (int i=size;
            i>location;
            i--) {
                link = link.previous;
            }
        }
        Link<E> previous = link.previous;
        Link<E> newLink = new Link<>(object, previous, link);
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