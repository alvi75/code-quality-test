import java.util.*;

public class Generated_636767561a6d9265ec017f63 {
    @Override
    public boolean hasNext() {
        if (this.vertexes.size() == 0) {
            return false;
        }
        for (int i = 0; i < this.vertexes.size(); i++) {
            if (!this.visited[i]) {
                return true;
            }
        }
        return false;
    }
}