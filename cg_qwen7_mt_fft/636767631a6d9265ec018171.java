import java.util.*;

public class Generated_636767631a6d9265ec018171 {
    private boolean unlinkListNode(int unlinkIndex) {
        // check if we can actually remove a node from this list
        if (size <= 0) {
            return false;
        }

        // find the node to be removed
        ListNodeImpl<E> targetNode = getListNode(unlinkIndex);

        // remember previous and next nodes in order to link them accordingly
        ListNodeImpl<E> prevNode = (ListNodeImpl<E>)targetNode.prev;
        ListNodeImpl<E> nextNode = (ListNodeImpl<E>)targetNode.next;

        // adjust neighbor nodes accordingly
        if (prevNode != null) {
            prevNode.next = nextNode;
        } else { // removing head node
            head = nextNode;
        }
        if (nextNode != null) {
            nextNode.prev = prevNode;
        } else { // removing tail node
            last = prevNode;
        }

        size--;
        modCount++;

        return true;
    }
}