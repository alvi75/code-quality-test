import java.util.*;

public class Generated_636767561a6d9265ec017f7c {
    /**
 * Convert a set representation to a graph path.
 **/
protected GraphPath<V,E> edgeSetToTour(Set<E> tour,Graph<V,E> graph){
        List<E> edges = new ArrayList<E>(tour);
        Collections.sort(edges,new Comparator<E>(){
            public int compare(E e1,E e2){
                return graph.getEdgeSource(e1).compareTo(graph.getEdgeSource(e2));
            }
        });
        return graph.createPath(edges);
    }
}