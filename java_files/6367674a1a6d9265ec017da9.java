import java.util.*;

public class Generated_6367674a1a6d9265ec017da9 {
    private void moveAllListNodes(DoublyLinkedList<E> list){
		if(list == null || list.isEmpty())
			return;
		
		DLLNode<E> node = list.first;
		while(node != null){
			list.removeNode(node);
			this.addNode(node.value, node.index);
			node = node.next;
		}
	}
}