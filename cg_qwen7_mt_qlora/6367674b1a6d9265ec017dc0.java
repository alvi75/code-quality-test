import java.util.*;

public class Generated_6367674b1a6d9265ec017dc0 {
    /**Compute all vertices by iterating over the edges of this graph.**/
    private Set<V> initVisibleVertices(){
        Set<V> visible = new HashSet<>();
        for (E e : getEdges()){
            V v1 = getEdgeSource(e);
            V v2 = getEdgeTarget(e);

            if (!visible.contains(v1)){
                visible.add(v1);
            }
            if (!visible.contains(v2)){
                visible.add(v2);
            }
        }

        return visible;
    }
}