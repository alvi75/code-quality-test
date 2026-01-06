import java.util.*;

public class Generated_6367674a1a6d9265ec017da9 {
    /**Move the nodes of the given doubly linked list to a new list sequentially.*/
    private void moveAllListNodes(DoublyLinkedList<E> list) {
        DoublyLinkedListNode<E> node = list.head;
        while (node != null) {
            DoublyLinkedListNode<E> next = node.next;
            node.next = null;
            node.prev = null;
            addNode(node);
            node = next;
        }
    }
}