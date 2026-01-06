import java.util.*;

public class Translation70 {
    ublic void remove() {
    if (expectedModCount == list.modCount) {
        if (lastLink != null) {
            Link<E> next = lastLink.next;
            Link<E> prev = lastLink.previous;
            prev.next = next;
            next.prev = prev;
            if (lastLink == link) {
                pos--;
            }
            link = prev;
            lastLink = null;
            expectedModCount++;
            list.size--;
            list.modCount++;
        }
        else {
            throw new IllegalStateException();
        }
    }
    else {
        throw new ConcurrentModificationException();
    }
}
}