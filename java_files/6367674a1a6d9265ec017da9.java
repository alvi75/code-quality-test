import java.util.*;

public class Generated_6367674a1a6d9265ec017da9 {
    private void moveAllListNodes(DoublyLinkedList<E> list) {
        if (list == null)
            return;
        DoublyLinkedList<E> newList = new DoublyLinkedList<E>();
        newList.addFirst(list.first());
        newList.addLast(list.last());
        list.clear();
        list = newList;
    }
}