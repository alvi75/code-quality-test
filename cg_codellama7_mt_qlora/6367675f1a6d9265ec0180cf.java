import java.util.*;

public class Generated_6367675f1a6d9265ec0180cf {
    public static <V, E> boolean isClique(Graph<V, E> graph, Set<V> vertices) {
        return vertices.size() == graph.degreeOfVertices(vertices);
    }
}