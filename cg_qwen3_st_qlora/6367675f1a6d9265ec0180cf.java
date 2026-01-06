import java.util.*;

public class Generated_6367675f1a6d9265ec0180cf {
    /**
 * Return true if the subgraph of the given graph induced by the given vertices is a clique,otherwise return false.
 **/
    private static <V,E> boolean isClique(Graph<V,E> graph, Set<V> vertices) {
        for (V v : vertices) {
            for (V u : vertices) {
                if (!graph.containsEdge(v,u)) {
                    return false;
                }
            }
        }
        return true;
    }
}