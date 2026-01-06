import java.util.*;

public class Generated_6367674a1a6d9265ec017da9 {
    /**
 * Move the nodes of the given doubly linked list to a new list sequentially.
 */ private void moveAllListNodes(DoublyLinkedList<E> list) {
        if (list != null && !list.isEmpty()) {
            //move all nodes from the list to this list
            for (DoublyLinkedNode<E> node = list.first; node != null; node = node.next) {
                addLast(node.element);
            }
            //remove all nodes from the source list
            list.clear();
        }
    }
}