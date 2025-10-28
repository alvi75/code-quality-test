import java.util.*;

public class Generated_636767611a6d9265ec018112 {
    /**Get next vertext from a graph.**/
    @Override
    protected V provideNextVertex(){
        if (this.vertexCount == 0) {
            return null;
        }
        int index = this.index++;
        if (index >= this.vertexCount) {
            // we have reached the end of the graph
            return null;
        }
        V vertex = this.vertices[index];
        this.index = index + 1;
        return vertex;
    }
}