import java.util.*;

public class Generated_636767631a6d9265ec018171 {
    /**Remove the doubly circular linked list node.If success return true,otherwise return false.**/
    private boolean unlink(ListNodeImpl<E> node){
        if(node == null) return false;
        ListNodeImpl<E> next = node.next;
        ListNodeImpl<E> prev = node.prev;
        if(prev != null) prev.next = next;
        else head = next;
        if(next != null) next.prev = prev;
        else tail = prev;
        size--;
        return true;
    }
}