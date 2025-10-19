import java.util.*;

public class Generated_636767561a6d9265ec017f7c {
    protected GraphPath<V,E> edgeSetToTour(Set<E> tour,Graph<V,E> graph){
        if(tour.size() < 2) return null;
        GraphPath<V,E> path = new GraphPath<V,E>(graph);
        for(int i=0;i<tour.size()-1;i++){
            E e = tour.get(i);
            V v = graph.vertex(e);
            E next = tour.get(i+1);
            V nv = graph.vertex(next);
            path.addEdge(v,nv);
        }
        return path;
    }
}