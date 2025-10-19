import java.util.*;

public class Generated_636767611a6d9265ec018112 {
    @Override
    protected V provideNextVertex() {
        if (this.currentVertex == null) {
            this.currentVertex = new Vertex(this.graph);
            this.currentEdge = null;
            return this.currentVertex;
        } else {
            // get next vertex in the graph
            this.currentVertex = this.graph.getVertices().iterator().next();
            this.currentEdge = null;
            return this.currentVertex;
        }
    }
}