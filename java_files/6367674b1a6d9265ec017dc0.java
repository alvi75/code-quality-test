import java.util.*;

public class Generated_6367674b1a6d9265ec017dc0 {
    private Set<V> initVisibleVertices(){
        Set<V> visibleVertices = new HashSet<>();
        for (Edge e : edges){
            if (!e.isDirected()){
                visibleVertices.add(e.getOther(e.getSource()));
            }
        }
        return visibleVertices;
    }
}