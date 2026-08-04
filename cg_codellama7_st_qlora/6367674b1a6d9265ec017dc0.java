import java.util.*;

public class Generated_6367674b1a6d9265ec017dc0 {
    private Set<V> initVisibleVertices(){
		Set<V> visibleVertices = new HashSet<V>();
		for(E edge : edges){
			visibleVertices.add(edge.getSource());
			visibleVertices.add(edge.getTarget());
		}
		return visibleVertices;
	}
}