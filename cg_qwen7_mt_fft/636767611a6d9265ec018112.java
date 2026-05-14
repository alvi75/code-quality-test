import java.util.*;

public class Generated_636767611a6d9265ec018112 {
    @Override
    protected V provideNextVertex() {
        if (this.graph.vertices().iterator().hasNext()) {
            return this.graph.vertices().iterator().next();
        }
        else{
            throw new NoSuchElementException("No more vertex in graph");
        }
    }
}