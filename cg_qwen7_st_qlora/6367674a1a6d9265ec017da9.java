import java.util.*;

public class Generated_6367674a1a6d9265ec017da9 {
    private void moveAllListNodes(DoublyLinkedList<E> list){
		if(list.isEmpty()){
			return;
		}
		
		Node<E> node = list.head;
		while(node != null){
			this.addLast(node.value);
			node = node.next;
		}
	}
}