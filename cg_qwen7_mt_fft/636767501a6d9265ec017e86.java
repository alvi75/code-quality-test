import java.util.*;

public class Generated_636767501a6d9265ec017e86 {
    public ListNode<E> previousNode() {
		if (prev == null) {
			return last;
		} else if (prev.item == null) {
			prev = prev.prev;
			return this;
		} else {
			return prev;
		}
	}
}