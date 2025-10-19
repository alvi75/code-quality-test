import java.util.*;

public class Generated_636767561a6d9265ec017f7c {
    protected GraphPath<V,E> edgeSetToTour(Set<E> tour,Graph<V,E> graph){
		if(tour.size() == 0) return null;
		GraphPath<V,E> result = new GraphPath<V,E>();
		int[] index = new int[tour.size()];
		for(int i=0;i<tour.size();i++){
			index[i] = graph.indexOf(tour.get(i));
		}
		return result.setEdges(index);
	}
}