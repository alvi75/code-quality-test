import java.util.*;

public class Generated_636767501a6d9265ec017e86 {
    /**Returns the previous ListNode.**/
    @Override
    public ListNode<E> previousNode(){
        if (prev == null) {
            return null;
        }
        return prev.next;
    }
}