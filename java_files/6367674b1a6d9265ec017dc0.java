import java.util.*;

public class Generated_6367674b1a6d9265ec017dc0 {
    private Set<V> initVisibleVertices(){
        //System.out.println("initVisibleVertices");
        Set<V> visibleVertices = new HashSet<>();
        for (Edge e : edges) {
            if (!e.isDirected()) {
                visibleVertices.add(e.getOtherVertex());
            }
        }
        return visibleVertices;
    }
}