import java.util.*;

public class Translation70 {
    public void remove() {
    if (expectedModCount == list.modCount) {
        if (lastLink != null) {
            Link<E> next = lastLink.next,last = lastLink.previous;
            next.previous = last;
            last.next = next;
            if (lastLink == link)pos-- ;
            link = last;
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