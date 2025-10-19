import java.util.*;

public class Generated_636767611a6d9265ec018112 {
    @Override
	protected V provideNextVertex(){
		if (this.nextVertex == null){
			this.nextVertex = this.graph.getVertices().iterator().next();
		}
		return this.nextVertex;
	}
}