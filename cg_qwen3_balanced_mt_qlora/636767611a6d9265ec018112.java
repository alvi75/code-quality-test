import java.util.*;

public class Generated_636767611a6d9265ec018112 {
    /**Get next vertext from a graph.**/
  @Override protected V provideNextVertex() {
    if (this.nextVertex == null) {
      this.nextVertex = this.graph.getVertex(this.nextVertexId);
    }
    return this.nextVertex;
  }
}