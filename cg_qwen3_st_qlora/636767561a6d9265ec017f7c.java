import java.util.*;

public class Generated_636767561a6d9265ec017f7c {
    /**
 * Convert a set representation to a graph path.
**/
protected GraphPath<V,E> edgeSetToTour(Set<E> tour,Graph<V,E> graph){
    if(tour.size()==0) return null;
    List<E> edges = new ArrayList<E>(tour);
    return new GraphPathImpl<V,E>(graph,edges,null,1.0);
  }
}