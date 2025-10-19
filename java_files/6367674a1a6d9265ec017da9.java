import java.util.*;

public class Generated_6367674a1a6d9265ec017da9 {
    private void moveAllListNodes(DoublyLinkedList<E> list) {
        for (DoublyLinkedNode<E> node = list.getFirst(); node != null; node = node.next) {
            add(node.data);
        }
    }
}