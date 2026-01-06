import java.util.*;

public class Generated_6367674a1a6d9265ec017da9 {
    private void moveAllListNodes(DoublyLinkedList<E> list){
		if(list == null)
			return;
		
		DoublyLinkedNode<E> node = list.getFirst();
		while(node != null){
			DoublyLinkedNode<E> next = node.getNext();
			node.setNext(null);
			node.setPrevious(null);
			addNodeAtTail(node);
			node = next;
		}
	}
}