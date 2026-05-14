import java.util.*;

public class Generated_636767631a6d9265ec018171 {
    /**Remove the doubly circular linked list node.If success return true,otherwise return false.**/
    private boolean unlink(ListNodeImpl<E> node){
        if(node == null || !node.isInList()){
            return false;
        }
        ListNodeImpl<E> prev = node.getPrev();
        ListNodeImpl<E> next = node.getNext();

        //if this is the only element in the list.
        if(prev == node && next == node){
            head = null;
            tail = null;
        }else{
            prev.setNext(next);
            next.setPrev(prev);

            if(head == node){
                head = next;
            }

            if(tail == node){
                tail = prev;
            }
        }
        node.setNext(null);
        node.setPrev(null);
        size--;
        modCount++;
        return true;
    }
}