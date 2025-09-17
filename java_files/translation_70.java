import java.util.*;

public class Translationtranslation_70 {
    public void remove() {
        if (expectedModCount == list.modCount) {
            if (lastLink != null) {
                Link<ET> next = lastLink.next;
                Link<ET> prev = lastLink.previous;
                next.previous = prev;
                prev.next = next;
                if (lastLink == link) {
                    pos--;
                    link = null;
                    lastLink = null;
                    expectedModCount++;
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