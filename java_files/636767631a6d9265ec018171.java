import java.util.*;

public class Generated_636767631a6d9265ec018171 {
    private boolean unlink(ListNodeImpl<E> node){
		ListNodeImpl<E> prev = node.prev;
		ListNodeImpl<E> next = node.next;
		
		if(prev == null && next == null) {
			this.head = null;
			this.tail = null;
			this.size = 0;
			return true;
		}
		
		if(prev != null) {
			prev.next = next;
		} else { //prev is null means it's head.
			this.head = next;
		}
		
		if(next != null) {
			next.prev = prev;
		} else { //next is null means it's tail.
			this.tail = prev;
		}
		
		node.prev = null;
		node.next = null;
		this.size--;
		return true;
	}
}