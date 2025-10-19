import java.util.*;

public class Generated_636767611a6d9265ec018112 {
    /**Get next vertext from a graph.**/
@Override protected V provideNextVertex(){
        if (this.graph == null){
            return null;
        }
        else{
            return this.graph.next();
        }
    }
}