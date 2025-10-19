import java.util.*;

public class Generated_6367674b1a6d9265ec017dc0 {
    /**Compute all vertices by iterating over the edges of this graph.
@param g The graph to compute visible vertices for.
@return A set containing all vertices in the graph.
@throws IllegalArgumentException if the graph is not connected.
*/
public Set<V> initVisibleVertices() {
        Set<V> result = new HashSet<>();
        //Iterate over all edges, adding each vertex to the result set.
        for (Edge<V,E> edge : getEdges()) {
            result.add(edge.getSource());
            result.add(edge.getTarget());
        }
        return result;
    }
}