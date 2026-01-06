import java.util.*;

public class Generated_636767631a6d9265ec018171 {
    private boolean unlink(ListNodeImpl<E> node){
        if (node == null) {
            throw new IllegalArgumentException("null node");
        }
        //unlink from next node
        ListNodeImpl<E> next = node.next;
        if (next != null) {
            next.prev = node.prev;
        } else {
            last = node.prev;
        }
        //unlink from prev node
        ListNodeImpl<E> prev = node.prev;
        if (prev != null) {
            prev.next = node.next;
        } else {
            first = node.next;
        }
        //unlink from head of list
        if (first == node) {
            first = null;
        }
        if (last == node) {
            last = null;
        }
        --size;
        --modCount;
        return true;
    }
}