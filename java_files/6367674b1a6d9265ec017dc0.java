import java.util.*;

public class Generated_6367674b1a6d9265ec017dc0 {
    /**
 * /**Compute all vertices by iterating over the edges of this graph.**/
    private Set<V> initVisibleVertices(){
        Set<V> visibleVertices = new HashSet<>();
        for (Edge<V, E> edge : edges) {
            visibleVertices.add(edge.getFrom());
            visibleVertices.add(edge.getTo());
        }
        return visibleVertices;
    }
}