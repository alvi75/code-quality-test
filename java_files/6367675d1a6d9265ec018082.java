import java.util.*;

public class Generated_6367675d1a6d9265ec018082 {
    Edge edgeToNext(){
        if( !hasNext() )
            throw new NoSuchElementException();
        Edge e = next.edge;
        next.node = next.node.next;
        return e;
    }
}