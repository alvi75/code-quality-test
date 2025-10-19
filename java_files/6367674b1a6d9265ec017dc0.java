import java.util.*;

public class Generated_6367674b1a6d9265ec017dc0 {
    private Set<V> initVisibleVertices(){
		Set<V> visible = new HashSet<>();
		for (E edge : graph.edges()){
			if (!visible.contains(graph.getVertex(edge.getStart()))){
				visible.add(graph.getVertex(edge.getStart()));
			}
			if (!visible.contains(graph.getVertex(edge.getEnd()))){
				visible.add(graph.getVertex(edge.getEnd()));
			}
		}
		return visible;
	}
}