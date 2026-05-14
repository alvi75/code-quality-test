import java.util.*;

public class Generated_636767561a6d9265ec017f7c {
    protected GraphPath<V,E> edgeSetToTour(Set<E> tour,Graph<V,E> graph){
        List<E> edges = new ArrayList<>(tour);
        Collections.sort(edges,new Comparator<E>(){

            @Override
            public int compare(E o1, E o2) {
                return Double.compare(graph.getEdgeWeight(o1),graph.getEdgeWeight(o2));
            }
        });
        return new GraphWalk<V,E>(graph,edges);
    }
}