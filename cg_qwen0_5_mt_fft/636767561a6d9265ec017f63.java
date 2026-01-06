import java.util.*;

public class Generated_636767561a6d9265ec017f63 {
    @Override
    public boolean hasNext() {
        if (this.vertices.size() == 0) {
            return false;
        }
        for (int i = 0; i < this.vertices.size(); i++) {
            Vertex v = this.vertices.get(i);
            if (!v.isVisited()) {
                return true;
            }
        }
        return false;
    }
}