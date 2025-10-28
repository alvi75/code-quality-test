import java.util.*;

public class Generated_636767631a6d9265ec018171 {
    private boolean unlink(ListNodeImpl<E> node) {
        if (node == null)
            return false;
        // remove from list
        node.prev.next = node.next;
        node.next.prev = node.prev;

        // free memory
        node.next = null;
        node.prev = null;
        node.data = null;
        return true;
    }
}