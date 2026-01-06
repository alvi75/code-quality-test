import java.util.*;

public class Generated_636767501a6d9265ec017e86 {
    @Override
    public ListNode<E> previousNode(){
        if (previous == null)
            return null;
        else {
            ListNode<E> node = previous;
            previous = node.next;
            node.next = this;
            return node;
        }
    }
}