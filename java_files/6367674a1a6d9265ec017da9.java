import java.util.*;

public class Generated_6367674a1a6d9265ec017da9 {
    /**Move the nodes of the given doubly linked list to a new list sequentially.*/
    private void moveAllListNodes(DoublyLinkedList<E> list){
        if(list == null) return;
        
        //move all nodes in the list to this list.
        for(Node<E> node = list.getFirst(); node != null; node = node.getNext()){
            add(node.getData());
        }
    }
}