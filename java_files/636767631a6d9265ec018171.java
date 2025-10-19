import java.util.*;

public class Generated_636767631a6d9265ec018171 {
    private boolean unlink(ListNodeImpl<E> node) {
        if (node == null || node.next == null)
            return false;
        //assert(node.previous != null);
        //assert(node.next != null);

        ListNodeImpl<E> prev = node.previous;
        ListNodeImpl<E> next = node.next;

        prev.next = next;
        next.previous = prev;
        size--;
        return true;
    }
}