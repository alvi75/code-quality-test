import java.util.*;

public class Generated_636767631a6d9265ec018171 {
    /**Remove the doubly circular linked list node.If success return true,otherwise return false.*/
    private boolean unlink(ListNodeImpl<E> node){
        if(node == null) return false;
        //remove head
        if(head == node){
            if(head.next == head){
                head = null;
                tail = null;
            }else{
                head = head.next;
                tail.next = head;
                head.pre = tail;
            }
        }else{//remove other nodes
            ListNodeImpl<E> preNode = node.pre;
            ListNodeImpl<E> nextNode = node.next;
            preNode.next = nextNode;
            nextNode.pre = preNode;
        }
        size--;
        return true;
    }
}