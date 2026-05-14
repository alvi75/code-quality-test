import java.util.*;

public class Generated_636767631a6d9265ec018171 {
    private boolean unlink(ListNodeImpl<E> node){
        if(node == null || node.prev == null || node.next == null)
            return false;
        
        ListNodeImpl<E> prev = node.prev;
        ListNodeImpl<E> next = node.next;

        //remove from the list.
        prev.next = next;
        next.prev = prev;
        size--;
        modCount++;
        return true;
    }
}