import java.util.*;

public class Generated_636767501a6d9265ec017e86 {
    @Override
	public ListNode<E> previousNode()
	{
		if(hasPrevious())
			return (ListNode<E>)previous.get();
		
		throw new NoSuchElementException();	
	}
}