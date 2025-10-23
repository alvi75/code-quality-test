import java.util.*;

public class Generated_6367675f1a6d9265ec0180cf {
    private static <V,E>boolean isClique(Graph<V,E> graph,Set<V> vertices){
		for(V v1:vertices)
			for(V v2:vertices)
				if(!graph.containsEdge(v1,v2))
					return false;
		return true;
	}
}