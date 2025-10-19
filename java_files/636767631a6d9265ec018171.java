import java.util.*;

public class Generated_636767631a6d9265ec018171 {
    /**Remove the doubly circular linked list node.If success return true,otherwise return false.
 * @param node
 */
private boolean unlink(ListNodeImpl<E> node) {
        if (node == null || node.next == null)
            return false;
        ListNodeImpl<E> prev = node.prev;
        ListNodeImpl<E> next = node.next;

        //unlink from previous
        if (prev != null){
            prev.next = next;
        }
        else{
            head = next;
        }

        //unlink from next
        if(next != null){
            next.prev = prev;
        }
        else{
            tail = prev;
        }

        node.next = null;
        node.prev = null;
        size--;
        return true;
    }
}