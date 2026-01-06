import java.util.*;

public class Translation70 {
    public final void remove() {
    if ( expectedModCount == modCount ) {
        Link<E> prev = getPrevious(link);
        Link<E> next = getNext(link);
        prev.next = next;
        next.prev = prev;
        if ( link == last ) {
            last = prev;
        }
        modCount++;
    }
    else {
        throw new ConcurrentModificationException();
    }
}
}