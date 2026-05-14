import java.util.*;

public class Generated_6367674b1a6d9265ec017dc0 {
    private Set<V> initVisibleVertices(){
		Set<V> visible = new HashSet<>();
		for(Edge<V,E> e : getEdges()){
			V v1 = e.getVertex1();
			if(!visible.contains(v1)){
				visible.add(v1);
			}
			V v2 = e.getVertex2();
			if(!visible.contains(v2)){
				visible.add(v2);
			}
		}
		return visible;
	}
}