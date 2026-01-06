import java.util.*;

public class Generated_636767561a6d9265ec017f7c {
    /**
 * Convert a set representation to a graph path.
 **/
protected GraphPath<V,E> edgeSetToTour(Set<E> tour,Graph<V,E> graph){
		if(tour.size()==0) return null;
		List<E> edges = new ArrayList<E>(tour);
		Collections.sort(edges,new Comparator<E>() {
			public int compare(E e1,E e2){
				return graph.getEdgeWeight(e1)-graph.getEdgeWeight(e2);
			}
		});
		List<V> vertices = new ArrayList<V>();
		for(int i=0;i<edges.size();i++){
			E e = edges.get(i);
			V v = graph.getEdgeSource(e);
			if(vertices.contains(v)) continue;
			vertices.add(v);
			v = graph.getEdgeTarget(e);
			if(vertices.contains(v)) continue;
			vertices.add(v);
		}
		return new GraphPath<V,E>(graph,vertices,edges);
	}
}