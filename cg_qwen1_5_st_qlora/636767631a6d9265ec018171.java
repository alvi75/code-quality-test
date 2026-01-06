import java.util.*;

public class Generated_636767631a6d9265ec018171 {
    /**Remove the doubly circular linked list node.If success return true,otherwise return false.*/
    private boolean unlink(ListNodeImpl<E> node){
        if(node == null) return false;
        ListNodeImpl<E> prev = node.prev;
        ListNodeImpl<E> next = node.next;

        //unlink from previous
        if(prev != null)
            prev.next = next;

        //unlink from next
        if(next != null)
            next.prev = prev;

        //set to null
        node.prev = null;
        node.next = null;

        return true;
    }
}