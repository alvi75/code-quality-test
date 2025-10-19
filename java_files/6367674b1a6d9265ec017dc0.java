import java.util.*;

public class Generated_6367674b1a6d9265ec017dc0 {
    private Set<V> initVisibleVertices() {
        Set<V> visibleVertices = new HashSet<>();
        for (V v : getVertices()) {
            if (!isVertexHidden(v)) {
                visibleVertices.add(v);
            }
        }
        return visibleVertices;
    }
}