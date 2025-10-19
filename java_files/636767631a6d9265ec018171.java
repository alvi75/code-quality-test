import java.util.*;

public class Generated_636767631a6d9265ec018171 {
    private boolean unlink(ListNodeImpl<E> node){
        if(node == null)    return false;
        
        //unlink from the main list
        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            head = node.prev;
        }
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            tail = node.next;
        }
        
        //unlink from the list of the node's value
        if (node.value != null) {
            node.value.previous = node.next;
        } else {
            if (head == null)  return false;   //not in the list
            node.value = head.value;
            node.value.next = head.next;
        }
        
        //remove the node
        node.next = null;
        node.prev = null;
        return true;
    }
}