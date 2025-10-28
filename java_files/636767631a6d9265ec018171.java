import java.util.*;

public class Generated_636767631a6d9265ec018171 {
    /**
     * Remove the doubly circular linked list node.If success return true,otherwise return false.
     */
    private boolean unlink(ListNodeImpl<E> node) {
        if (node == null || node.prev == null || node.next == null)
            return false;
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.prev = null;
        node.next = null;
        return true;
    }
}