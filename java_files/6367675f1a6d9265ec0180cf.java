import java.util.*;

public class Generated_6367675f1a6d9265ec0180cf {
    private static <V,E>boolean isClique(Graph<V,E> graph,Set<V> vertices){
        for (int i = 0; i < vertices.size(); i++) {
            Set<V> clique = new HashSet<V>();
            clique.add(vertices.get(i));
            for (int j = i + 1; j < vertices.size(); j++) {
                clique.add(vertices.get(j));
                if (!isSubgraph(graph, clique)) {
                    return false;
                }
            }
        }
        return true;
    }
}