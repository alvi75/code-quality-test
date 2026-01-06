import java.util.*;

public class Generated_6367675f1a6d9265ec0180d3 {
    public static <V,E>IsomorphicGraphMapping<V,E> identity(Graph<V,E> graph){
        IsomorphicGraphMapping<V,E> mapping = new IsomorphicGraphMapping<V,E>(graph);
        for(V v: graph.vertexSet()){
            mapping.addVertex(v,v);
        }
        return mapping;
    }
}