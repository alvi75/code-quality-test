import java.util.*;

public class Translation70 {
    0;
int pos = 0;
java.util.LinkedList.Link<E> link = this.link;
java.util.LinkedList.Link<E> lastLink = this.lastLink;
int expectedModCount = list.modCount;
while (pos < size) {
    java.util.LinkedList.Link<E> next = link.next;
    java.util.LinkedList.Link<E> previous = link.previous;
    next.previous = previous;
    previous.next = next;
    if (link == lastLink) {
        pos--;
        break;
    }
    link = previous;
    lastLink = null;
    expectedModCount++;
    list._size--;
    list.modCount++;
}
if (expectedModCount != list.modCount) {
    throw new java.util.ConcurrentModificationException();
}
}
}