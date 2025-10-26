import java.util.*;

public class Translation70 {
    public synchronized void remove() {
    if (expectedModCount == list.modCount) {
        if (lastLink != null) {
            final Link < E > next_1 = lastLink.next;
            final Link < E > previous_1 = lastLink.previous;
            next_1 . previous = previous_1 ;
            previous_1 . next = next_1 ;
            if (lastLink == link) {
                pos -- ;
            }
            link = previous_1 ;
            lastLink = null ;
            expectedModCount ++ ;
            list . _size -- ;
            list . modCount ++ ;
        }
        else {
            throw new IllegalStateException ();
        }
    }
    else {
        throw new ConcurrentModificationException () ;
    }
}
}