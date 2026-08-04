import java.util.*;

public class Generated_636767631a6d9265ec018171 {
    private boolean unlink(ListNodeImpl<E> node){
        if(node==null)
            return false;
        if(node.prev==null || node.next==null)
            return false;
        node.prev.next=node.next;
        node.next.prev=node.prev;
        node.prev=null;
        node.next=null;
        return true;
    }
}