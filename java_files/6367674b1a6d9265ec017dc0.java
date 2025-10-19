import java.util.*;

public class Generated_6367674b1a6d9265ec017dc0 {
    private Set<V> initVisibleVertices(){
		Set<V> visible = new HashSet<>();
		for (E edge : edges) {
			visible.add(edge.getSource());
			visible.add(edge.getDestination());
		}
		return visible;
	}
}