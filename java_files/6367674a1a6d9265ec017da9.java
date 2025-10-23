import java.util.*;

public class Generated_6367674a1a6d9265ec017da9 {
    /**Move the nodes of the given doubly linked list to a new list sequentially.**/
    private void moveAllListNodes(DoublyLinkedList<E> list){
        if(list == null || list.isEmpty()) return;
        DoublyLinkedListNode<E> node = list.getFirst();
        while(node != null){
            addLast(node.getValue());
            node = node.getNext();
        }
    }
}