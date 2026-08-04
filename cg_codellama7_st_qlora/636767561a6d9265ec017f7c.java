import java.util.*;

public class Generated_636767561a6d9265ec017f7c {
    protected GraphPath<V,E> edgeSetToTour(Set<E> tour,Graph<V,E> graph){
		List<E> edges = new ArrayList<E>(tour);
		return new GraphWalk<V,E>(graph,edges);
	}
}