import java.util.*;

public class Generated_6367675f1a6d9265ec0180d3 {
    /**Compute and return an identity automorphism for the given graph.**/
	public static <V,E>IsomorphicGraphMapping<V,E> identity(Graph<V,E> graph){
		return new IsomorphicGraphMapping<V,E>(graph, graph);
	}
}