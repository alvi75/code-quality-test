import java.util.*;

public class Generated_636767501a6d9265ec017e86 {
    /**Returns the previous ListNode.**/
	@Override
	public ListNode<E> previousNode(){
		if (this.previous == null){
			return null;
		}
		else{
			this.previous.size--;
			return this.previous;
		}
	}
}