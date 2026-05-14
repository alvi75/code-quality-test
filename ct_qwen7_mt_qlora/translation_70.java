import java.util.*;

public class Translation70 {
    2 public void remove() {
    3 if (expectedModCount == list.modCount) {
        4 if (lastLink != null) {
            5 Link<E> next = lastLink.next;
            6 Link<E> previous = lastLink.previous;
            7 next.previous = previous;
            8 previous.next = next;
            9 if (lastLink == link) {
                10 pos--;
            }
            11 link = previous;
            12 lastLink = null;
            13 expectedModCount++;
            14 list.size--;
            15 list.modCount++;
            16 }
            else {
                17 throw new IllegalStateException();
                18 }
                19 }
                else {
                    20 throw new ConcurrentModificationException();
                    21 }
                }
}