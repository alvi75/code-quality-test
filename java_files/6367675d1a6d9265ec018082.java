import java.util.*;

public class Generated_6367675d1a6d9265ec018082 {
    public Edge edgeToNext(){
		if (next == null){
			next = graph.getEdge(from, to);
		}
		
		return next;
	}
}