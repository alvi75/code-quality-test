import java.util.*;

public class Generated_6367675f1a6d9265ec0180cf {
    /**
     * Return true if the subgraph of the given graph induced by the given vertices is a clique,otherwise return false.
     */
    private static <V,E>boolean isClique(Graph<V,E> graph,Set<V> vertices){
        for(V v:vertices)
            if(!graph.containsVertex(v))
                return false;
        for(V v1:vertices)
            for(V v2:vertices)
                if(v1==v2)continue;
                else if(graph.getEdgeWeight(graph.findEdge(v1,v2))==null)
                    return false;
        return true;
    }
}