import java.util.*;

public class Generated_6367674b1a6d9265ec017dc0 {
    private Set<V> initVisibleVertices(){
        Set<V> visibleVertices = new HashSet<>();
        for (E e : getEdges()){
            V v1 = e.getSource();
            V v2 = e.getTarget();
            if (!visibleVertices.contains(v1)){
                visibleVertices.add(v1);
            }
            if (!visibleVertices.contains(v2)){
                visibleVertices.add(v2);
            }
        }
        return visibleVertices;
    }
}