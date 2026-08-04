import java.util.*;

public class Generated_6367674a1a6d9265ec017da9 {
    public void moveAllListNodes(DoublyLinkedList<E> list) {
        if (list.size() == 0) {
            return;
        }
        if (list.size() == 1) {
            addLast(list.getFirst());
            return;
        }
        if (list.size() == 2) {
            addLast(list.getFirst());
            addLast(list.getLast());
            return;
        }
        DoublyLinkedListNode<E> first = list.getFirst();
        DoublyLinkedListNode<E> last = list.getLast();
        DoublyLinkedListNode<E> next = first.getNext();
        DoublyLinkedListNode<E> prev = last.getPrevious();
        first.setPrevious(last);
        last.setNext(first);
        prev.setNext(next);
        next.setPrevious(prev);
        addLast(first);
        list.clear();
    }
}