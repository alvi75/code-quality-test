import java.util.*;

public class Generated_636767501a6d9265ec017e86 {
    @Override
    public ListNode<E> previousNode() {
        if (index == 0) return null;
        index--;
        return new ListNode<E>(data[index], next[index]);
    }
}