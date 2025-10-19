import java.util.*;

public class Generated_636767561a6d9265ec017f63 {
    @Override
    public boolean hasNext(){
        if (this.visited == null){
            this.visited = new boolean[this.vertices.length];
            Arrays.fill(this.visited, false);
        }
        for (int i = 0; i < this.vertices.length; i++) {
            if (!this.visited[i]){
                return true;
            }
        }
        return false;
    }
}