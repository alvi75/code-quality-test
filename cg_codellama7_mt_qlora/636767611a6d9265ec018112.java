import java.util.*;

public class Generated_636767611a6d9265ec018112 {
    protected V provideNextVertex() {
    if (this.currentVertex == null) {
      this.currentVertex = this.graph.getFirstVertex();
    } else {
      this.currentVertex = this.graph.getNextVertex(this.currentVertex);
    }
    return this.currentVertex;
  }
}