import java.util.*;

public class Generated_636767631a6d9265ec018171 {
    private boolean unlink(ListNodeImpl<E> node){
        if(node == null)
            return false;
        ListNodeImpl<E> next = node.next;
        ListNodeImpl<E> prev = node.prev;
        //link the next node to the previous one
        next.prev = prev;
        //link the previous node to the next one
        prev.next = next;
        size--;
        modCount++;
        return true;
    }
}