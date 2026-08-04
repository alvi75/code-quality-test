import java.util.*;

public class Translation70 {
    public void remove() {
    if (expectedModCount == list.modCount) {
        if (lastLink != null) {
            java.util.LinkedList.Link<E> next = lastLink.next;
            java.util.LinkedList.Link<E> previous = lastLink.previous;
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