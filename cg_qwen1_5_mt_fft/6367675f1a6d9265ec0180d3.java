import java.util.*;

public class Generated_6367675f1a6d9265ec0180d3 {
    public static <V,E>IsomorphicGraphMapping<V,E> identity(Graph<V,E> graph){
		return new IdentityIsomorphicGraphMapping<>(graph);
	}
	
	/**
	 * Computes a mapping from vertices to a subset of the same size such that the induced subgraphs of both match.
	 * @param source Graph to be mapped into target
	 * @param target Subset to map into (subset is assumed to have the same number of elements as {@code source})
	 * @return Mapping object describing how to map the vertices in source onto the target set.
	 */
	public static <V,E>IsomorphicGraphMapping<V,E> getVertexSubstitution(Graph<V,E> source, Set<V> target) {
		if(source.vertexSet().size() != target.size()) throw new IllegalArgumentException("Target set must have the same number of elements as the source graph.");
		
		Map<V,V> vertexMap = new HashMap<>();
		for(V v : target)
			vertexMap.put(v,v);
		
		for(V v : source.vertexSet())
			if(!vertexMap.containsKey(v))
				vertexMap.put(v, v);
		
		return new IsomorphicGraphMapping<>(source, vertexMap);
	}
}