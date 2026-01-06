import java.util.*;

public class Generated_6367675f1a6d9265ec0180cf {
    private static <V,E>boolean isClique(Graph<V,E> graph,Set<V> vertices){
        //check whether all edges in the graph have one vertex from the set and the other from the set.
        for (E edge : graph.edges()){
            V v1 = graph.getEdgeSource(edge);
            V v2 = graph.getEdgeTarget(edge);

            if (!vertices.contains(v1) && !vertices.contains(v2)) {
                return false;
            }
            else if (vertices.contains(v1) && vertices.contains(v2)){
                continue;
            }
            else if (vertices.contains(v1) || vertices.contains(v2)){
                return false;
            }
        }

        return true;
    }
}