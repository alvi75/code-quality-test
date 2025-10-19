import java.util.*;

public class Generated_636767501a6d9265ec017e86 {
    @Override
	public ListNode<E> previousNode(){
		if(this.list == null){
			throw new RuntimeException("Attempt to access previous node in list that has been freed.");
		}
		if(this.prev == null){
			return this.list.firstNode();
		}else{
			return this.prev;
		}
	}
}