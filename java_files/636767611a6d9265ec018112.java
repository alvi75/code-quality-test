import java.util.*;

public class Generated_636767611a6d9265ec018112 {
    @Override
    protected V provideNextVertex(){
        if (this.currentVertex == null){
            this.currentVertex = this.graph.getGraph().getVertices().iterator().next();
        }
        return this.currentVertex;
    }
}