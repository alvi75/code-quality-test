import java.util.*;

public class Generated_6367674b1a6d9265ec017dc0 {
    private Set<V> initVisibleVertices(){
        Set<V> visible = new HashSet<>();
        for (EdgeIteratorState edge : getEdges()) {
            if (!edge.getVisibility())
                continue;
            V from = edge.getAdjNode() == getFromNode() ? getToVertex() : getFromVertex();
            V to = edge.getAdjNode() == getToNode() ? getToVertex() : getFromVertex();
            if (from != null && to != null) {
                visible.add(from);
                visible.add(to);
            }
        }
        return visible;
    }
}