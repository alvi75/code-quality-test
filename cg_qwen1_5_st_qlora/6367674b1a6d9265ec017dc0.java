import java.util.*;

public class Generated_6367674b1a6d9265ec017dc0 {
    /**Compute all vertices by iterating over the edges of this graph.**/
    private Set<V> initVisibleVertices(){
        Set<V> visibleVertices = new HashSet<>();
        for (E e : getEdges()){
            V v1 = e.getV1();
            if (!visibleVertices.contains(v1)) {
                visibleVertices.add(v1);
            }
            V v2 = e.getV2();
            if (!visibleVertices.contains(v2)){
                visibleVertices.add(v2);
            }
        }
        return visibleVertices;
    }
}