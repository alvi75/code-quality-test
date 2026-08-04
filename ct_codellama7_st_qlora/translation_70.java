import java.util.*;

public class Translation70 {
    public void remove() {
    if (expectedModCount == list.modCount) {
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