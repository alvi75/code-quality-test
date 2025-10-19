import java.util.*;

public class Generated_6367674a1a6d9265ec017da9 {
    private void moveAllListNodes(DoublyLinkedList<E> list){
		for (DoublyLinkedNode<E> node = list.head; node != null; node = node.next) {
			node.previous = null;
			node.next = null;
			list.size--;
			add(node.value);
		}
	}
}