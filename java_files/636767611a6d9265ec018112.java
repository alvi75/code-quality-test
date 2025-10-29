import java.util.*;

public class Generated_636767611a6d9265ec018112 {
    /**Get next vertext from a graph.**/
    @Override
    protected V provideNextVertex(){
        if (nextVertex == null) {
            //if no vertex is available, get one from the graph.
            nextVertex = graph.getVertex();
        }
        return nextVertex;
    }
}