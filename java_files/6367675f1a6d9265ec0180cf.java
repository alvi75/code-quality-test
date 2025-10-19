import java.util.*;

public class Generated_6367675f1a6d9265ec0180cf {
    private static <V,E> boolean isClique(Graph<V,E> graph,Set<V> vertices){
        for(V v:vertices)
            for(V w:vertices)
                if(!graph.containsEdge(v,w))
                    return false;
        return true;
    }
}