import java.util.*;

public class Generated_636767561a6d9265ec017f63 {
    /**Check whether there are unvisited vertices. If so, return true. Otherwise, return false.**/
    @Override
    public boolean hasNext(){
        if (this.visited.size() == 0) {
            return false;
        }
        for (int i = 0; i < this.visited.size(); i++) {
            if (!this.visited.get(i).isVisited()) {
                return true;
            }
        }
        return false;
    }
}