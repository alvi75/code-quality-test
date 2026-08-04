import java.util.*;

public class Generated_636767611a6d9265ec018112 {
    @Override
    protected V provideNextVertex(){
        if(this.currentVertex == null){
            this.currentVertex = this.graph.getVertices().iterator().next();
        }else{
            this.currentVertex = this.graph.getVertices().iterator().next();
            if(this.currentVertex.equals(this.lastVertex)){
                this.currentVertex = null;
            }
        }
        return this.currentVertex;
    }
}