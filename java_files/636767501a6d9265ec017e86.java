import java.util.*;

public class Generated_636767501a6d9265ec017e86 {
    /**Returns the previous ListNode.
@throws NoSuchElementException if there is no such node.
@return the previous ListNode.
*/
public ListNode<E> previousNode(){
        if (previous == null) {
            throw new NoSuchElementException();
        }
        return previous;
    }
}