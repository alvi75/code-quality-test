import java.util.*;

public class Translation70 {
    public void remove() {
    if (expectedModCount == list.modCount) {
        if (lastLink != null) {
            Link<ET> next = lastLink.next;
            Link<ET> previous = lastLink.previous;
            next.previous = previous;
            previous.next = next;
            if (lastLink == link) {
                pos--;
            }
            lastLink = previous;
            lastLink.next = null;
            if (expectedModCount == list.modCount) {
                list.size--;
                list.modCount++;
            }
        }
        else {
            throw new ConcurrentModificationException();
        }
    }
    else {
        throw new ConcurrentModificationException();
    }
}
}