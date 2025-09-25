import java.util.*;

public class Translation70 {
    public final void remove() {
    if (expectedModCount == list.modCount) {
        if (lastLink != null) {
            Link<ET> next = lastLink.next;
            Link<ET> prev = lastLink.previous;
            next.previous = prev;
            prev.next = next;
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