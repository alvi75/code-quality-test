import java.util.*;

public class Generated_636767631a6d9265ec018171 {
    /**Remove the doubly circular linked list node.If success return true,otherwise return false.**/
    private boolean unlink(ListNodeImpl<E> node){
        if (node == null) {
            return false;
        }
        ListNodeImpl<E> next = node.next;
        ListNodeImpl<E> prev = node.prev;

        //link the previous node to the next node.
        prev.next = next;
        next.prev = prev;

        //if this is the head node, then set the head to the next node.
        if (head == node) {
            head = next;
        }

        //if this is the tail node, then set the tail to the previous node.
        if (tail == node) {
            tail = prev;
        }

        size--;
        return true;
    }
}