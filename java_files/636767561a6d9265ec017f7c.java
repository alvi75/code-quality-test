import java.util.*;

public class Generated_636767561a6d9265ec017f7c {
    protected GraphPath<V,E> edgeSetToTour(Set<E> tour,Graph<V,E> graph){
		if(tour.size() == 0) return null;
		
		GraphPath<V,E> result = new GraphPath<V,E>();
		result.setSource(graph.getVertex(tour.iterator().next().source()));
		result.addEdges(new ArrayList<Edge<V,E>>(tour));
		return result;
	}
}