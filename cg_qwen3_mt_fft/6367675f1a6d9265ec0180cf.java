import java.util.*;

public class Generated_6367675f1a6d9265ec0180cf {
    private static <V,E>boolean isClique(Graph<V,E> graph,Set<V> vertices){
        for (V vertex : vertices) {
            Set<V> neighbors = new HashSet<>();
            for (E edge : graph.getEdges(vertex)) {
                neighbors.add(graph.getEdgeTarget(edge));
            }
            if(neighbors.size() != vertices.size()) return false;
        }
        return true;
    }
}