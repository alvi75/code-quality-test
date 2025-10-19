import java.util.*;

public class Generated_636767561a6d9265ec017f7c {
    protected GraphPath<V,E> edgeSetToTour(Set<E> tour,Graph<V,E> graph){
		GraphPath<V,E> path = new GraphPath<V,E>();
		for(E e:tour)
			path.add(e);
		return path;
	}
}