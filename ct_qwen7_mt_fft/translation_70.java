import java.util.*;

public class Translation70 {
    public void remove() {
    if (expectedModCount == modCount) {
        if (lastLink != null) {
            LinkedList.Link<E> next = lastLink.next;
            LinkedList.Link<E> previous = lastLink.previous;
            next.previous = previous;
            previous.next = next;
            if (lastLink == link) pos--;
            link = previous;
            lastLink = null;
            expectedModCount++;
            modCount++;
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