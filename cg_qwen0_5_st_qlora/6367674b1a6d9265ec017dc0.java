import java.util.*;

public class Generated_6367674b1a6d9265ec017dc0 {
    private Set<V> initVisibleVertices(){
        Set<V> visibleVertices = new HashSet<>();
        for (Edge<V,E> edge : edges){
            if (!edge.isDirected()){
                visibleVertices.add(edge.getOtherVertex());
            }
        }
        return visibleVertices;
    }
}