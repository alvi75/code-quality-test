import java.util.*;

public class Generated_6367675d1a6d9265ec018082 {
    public Edge edgeToNext(){
		if( !hasNext() )
			throw new NoSuchElementException();
		Edge e = next.edge;
		next = next.next;
		return e;
	}
}