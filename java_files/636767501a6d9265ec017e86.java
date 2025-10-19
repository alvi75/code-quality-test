import java.util.*;

public class Generated_636767501a6d9265ec017e86 {
    @Override
	public ListNode<E> previousNode(){
		if (currentNode == null)
			return null;
		
		if (currentNode.previous != null)
			return currentNode.previous;
		else
			return null;
	}
}