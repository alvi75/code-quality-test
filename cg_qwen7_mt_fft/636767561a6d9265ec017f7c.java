import java.util.*;

public class Generated_636767561a6d9265ec017f7c {
    protected GraphPath<V,E> edgeSetToTour(Set<E> tour,Graph<V,E> graph){
        if (tour == null)
            return null;
        GraphPathBuilder<V,E> builder = new GraphPathBuilder<>(graph);
        for (E e : tour) {
            builder.addEdge(e);
        }
        return builder.create();
    }
}