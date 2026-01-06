import java.util.*;

public class Translation521 {
    public void add(int location, E object) {
    if (location >= 0 && location <= size) {
        Link<E> link = link();
        if (location < (size / 2)) {
            for (int i = 0;
            i <= location;
            i++) {
                link = link.next;
            }
        }
        else {
            for (int i = size;
            i > location;
            i--) {
                link = link.previous;
            }
        }
        link.next = new Link<E>(object, link.previous, null);
        link.previous = link;
        size++;
        modCount++;
    }
}