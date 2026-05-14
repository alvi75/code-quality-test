import java.util.*;

public class Generated_6367674a1a6d9265ec017da9 {
    private void moveAllListNodes(DoublyLinkedList<E> list) {
        //move all the nodes from the list into this list in order.
        while(list.size > 0){
            Node<E> n = list.removeFirstNode();
            addLast(n);
        }
    }
}