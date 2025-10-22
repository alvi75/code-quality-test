import java.util.*;

public class Generated_636767631a6d9265ec018171 {
    /**
 * Remove the doubly circular linked list node.If success return true,otherwise return false.
 **/
private boolean unlink(ListNodeImpl<E> node){
        if(node == null) return false;
        ListNodeImpl<E> next = node.next;
        ListNodeImpl<E> prev = node.prev;

        //if the node is head or tail,then set the head or tail to be the next node of the node.
        if(head == node){
            head = next;
        }
        if(tail == node){
            tail = prev;
        }

        //set the next node's prev to be the prev node.
        next.prev = prev;
        //set the prev node's next to be the next node.
        prev.next = next;

        size--;
        return true;
    }
}