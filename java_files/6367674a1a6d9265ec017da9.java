import java.util.*;

public class Generated_6367674a1a6d9265ec017da9 {
    private void moveAllListNodes(DoublyLinkedList<E> list) {
        if (list == null)
            return;
        Node<E> node = list.head.next;
        while (node != list.tail){
            insertAfter(node, head);
            node = node.next;
        }
    }
}