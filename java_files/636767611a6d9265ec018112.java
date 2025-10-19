import java.util.*;

public class Generated_636767611a6d9265ec018112 {
    @Override
    protected V provideNextVertex(){
        if (this.hasNextVertex()) {
            this.currentEdge = this.edges.get(this.edgeIndex);
            this.edgeIndex++;
            return this.currentEdge.getTarget();
        }
        else{
            throw new NoSuchElementException("No more vertex in this Graph.");
        }
    }
}