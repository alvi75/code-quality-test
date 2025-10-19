import java.util.*;

public class Generated_636767501a6d9265ec017e86 {
    @Override
	public ListNode<E> previousNode(){
		if (head == null) return null;
		ListNode<E> node = head;
		while(node != null && node.next != null)
			node = node.next;
		return node;
	}
}