import java.util.*;

public class Generated_636767631a6d9265ec018171 {
    /**
 * Remove the doubly circular linked list node.If success return true,otherwise return false.
**/
private boolean unlink(ListNodeImpl<E> node){
        if(node == null || node.next == null || node.prev == null)
            return false;
        
        ListNodeImpl<E> next = node.next;
        ListNodeImpl<E> prev = node.prev;
        
        //unlink the node from the list
        next.prev = prev;
        prev.next = next;
        
        //if the node is the head of the list,then set the new head to the next node
        if(head == node)
            head = next;
        
        //if the node is the tail of the list,then set the new tail to the previous node
        if(tail == node)
            tail = prev;
        
        size--;
        return true;
    }
}