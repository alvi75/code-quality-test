import java.util.*;

public class Generated_6367674a1a6d9265ec017da9 {
    /**Move the nodes of the given doubly linked list to a new list sequentially.**/
    private void moveAllListNodes(DoublyLinkedList<E> list){
        if(list == null || list.head == null) return;
        
        Node<E> node = list.head;
        while(node != null){
            Node<E> nextNode = node.next;
            
            //Remove from old list.
            removeNodeFromList(node);
            
            //Add to new list.
            addLast(node);
            
            node = nextNode;
        }
    }
}