import java.util.*;

public class Translation70 {
    public void remove() {
    if (expectedModCount == modCount) {
        if (lastLink != null) {
            Link<E> next = lastLink.next;
            Link<E> previous = lastLink.previous;
            next.previous = previous;
            previous.next = next;
            if (lastLink == link) {
                pos--;
            }
            link = previous;
            lastLink = null;
            expectedModCount++;
            size--;
            modCount++;
        }
        else {
            throw new ConcurrentModificationException();
        }
    }
    else {
        throw new IllegalStateException();
    }
}
}