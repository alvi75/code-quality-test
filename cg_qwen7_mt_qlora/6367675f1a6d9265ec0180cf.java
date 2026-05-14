import java.util.*;

public class Generated_6367675f1a6d9265ec0180cf {
    /**Return true if the subgraph of the given graph induced by the given vertices is a clique,otherwise return false.**/
    private static <V,E>boolean isClique(Graph<V,E> graph,Set<V> vertices){
        for (Iterator<V> it = vertices.iterator();it.hasNext();) {
            V v1=it.next();
            for (Iterator<V> it2 = vertices.iterator();it2.hasNext();) {
                V v2=it2.next();
                if(v1.equals(v2)) continue;
                if(!graph.containsEdge(v1,v2)){
                    return false;
                }
            }
        }
        return true;
    }
}