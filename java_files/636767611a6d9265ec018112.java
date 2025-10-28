import java.util.*;

public class Generated_636767611a6d9265ec018112 {
    /**
     * Get next vertext from a graph.
     */
    @Override
    protected V provideNextVertex() {
        if (graph == null) return null;
        if (!graph.hasNext()) return null;

        final V vertex = graph.next();
        if (vertex != null)
            vertices.add(vertex);
        return vertex;
    }
}