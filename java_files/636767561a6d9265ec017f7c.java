import java.util.*;

public class Generated_636767561a6d9265ec017f7c {
    protected GraphPath<V,E> edgeSetToTour(Set<E> tour,Graph<V,E> graph){
        return new GraphPath<>(tour.stream().map(e->graph.getEdge(e)).collect(Collectors.toList()));
    }
}