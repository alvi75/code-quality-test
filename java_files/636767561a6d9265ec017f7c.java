import java.util.*;

public class Generated_636767561a6d9265ec017f7c {
    protected GraphPath<V,E> edgeSetToTour(Set<E> tour,Graph<V,E> graph){
		GraphPath<V,E> path = new GraphPath<>();
		for(E e:tour)
			path.add(graph.getEdge(e));
		return path;
	}
}