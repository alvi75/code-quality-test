import java.util.*;

public class Translation70 {
    public void remove() {
    if (expectedModCount == list.modCount) {
        if (lastLink != null) {
            LinkedList.Link<ET> next_1 = lastLink.next;
            LinkedList.Link<ET> previous_1 = lastLink.previous;
            next_1.previous = previous_1;
            previous_1.next = next_1;
            if (lastLink == link) {
                pos--;
            }
            link = previous_1;
            lastLink = null;
            expectedModCount++;
            list.size--;
            list.modCount++;
        }
        else {
            throw new ConcurrentModificationException();
        }
    }
}
else {
    throw new InvalidCyclicCollectionModificationException();
}
}
}