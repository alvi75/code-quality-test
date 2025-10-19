import java.util.*;

public class Generated_636767631a6d9265ec018171 {
    /**Remove the doubly circular linked list node.If success return true,otherwise return false.**/
    private boolean unlink(ListNodeImpl<E> node) {
        if (node == null)
            return false;
        if (node.prev == null && node.next == null) {
            head = null;
            tail = null;
            size--;
            return true;
        }
        if (node.prev != null) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
            return true;
        }
        if (node.next != null) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
            return true;
        }
        return false;
    }
}