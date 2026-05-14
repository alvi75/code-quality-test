import java.util.*;

public class Generated_6367674b1a6d9265ec017dc0 {
    private Set<V> initVisibleVertices() {
        final Set<V> result = new HashSet<>();
        for (E edge : getEdges()) {
            if (!isEdgeHidden(edge)) {
                V vertex = getGraph().getEdgeSource(edge);
                if (isVisibleVertex(vertex)) {
                    result.add(getGraph().getEdgeSource(edge));
                }
                vertex = getGraph().getEdgeTarget(edge);
                if (isVisibleVertex(vertex)) {
                    result.add(getGraph().getEdgeTarget(edge));
                }
            }
        }
        return result;
    }
}