import java.util.*;

public class Generated_636767631a6d9265ec018171 {
    /**Remove the doubly circular linked list node.If success return true,otherwise return false.**/
    private boolean unlink(ListNodeImpl<E> node) {
        if (node == null)
            return false;
        if (node.prev == null && node.next == null) {
            head = null;
            tail = null;
            return true;
        }
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }
        node.prev = null;
        node.next = null;
        return true;
    }
}