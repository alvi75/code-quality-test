import java.util.*;

public class Translation521 {
    1 public void add(final int location, final E object) {
    2 if (location >= 0 && location <= size()) {
        3 Link<E> link = voidLink;
        4 if (location < (size() / 2)) {
            5 for (int i = 0;
            i <= location;
            i++) {
                6 link = link.next;
                7 }
                8 }
                else {
                    9 for (int i = size();
                    i > location;
                    i--) {
                        10 link = link.previous;
                        11 }
                        12 }
                        13 Link<E> previous = link.previous;
                        14 Link<E> newLink = new Link<>(object, previous, link);
                        15 previous.next = newLink;
                        16 link.previous = newLink;
                        17 size++;
                        18 modCount++;
                        19 }
                        else {
                            20 throw new IndexOutOfBoundsException();
                            21 }
                        }
}