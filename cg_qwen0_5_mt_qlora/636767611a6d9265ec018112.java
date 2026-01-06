import java.util.*;

public class Generated_636767611a6d9265ec018112 {
    /**Get next vertext from a graph.**/
@Override protected V provideNextVertex(){
        if (nextVertex == null) {
            // If we have no more vertices, return null.
            return null;
        }
        // Otherwise, return the next vertex in the list.
        V v = nextVertex;
        nextVertex = getNextVertex();
        return v;
    }
}