import java.util.*;

public class Generated_636767611a6d9265ec018112 {
    @Override
    protected V provideNextVertex(){
        if (this.graph == null){
            throw new IllegalStateException("Graph is not set");
        }
        return this.graph.next();
    }
}