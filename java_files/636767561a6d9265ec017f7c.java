import java.util.*;

public class Generated_636767561a6d9265ec017f7c {
    protected GraphPath<V,E> edgeSetToTour(Set<E> tour,Graph<V,E> graph){
        if(tour==null || tour.isEmpty()) return null;
        
        //create a new graph with the same vertices as the original one.
        Graph<V,E> g = graph.copy();
        
        //add all edges in the tour to the graph.
        for(E e : tour) {
            V v1 = graph.getEdgeSource(e);
            V v2 = graph.getEdgeTarget(e);
            
            g.addEdge(v1,v2,e);
        }
        
        //return the graph path.
        return new GraphPath<V,E>(g,tour);
    }
}