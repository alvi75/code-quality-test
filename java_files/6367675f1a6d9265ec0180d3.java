import java.util.*;

public class Generated_6367675f1a6d9265ec0180d3 {
    public static <V,E>IsomorphicGraphMapping<V,E> identity(Graph<V,E> graph) {
        final int n = graph.size();
        final Map<Integer, Integer> map = new HashMap<>(n);
        for (int i=0; i<n; ++i)
            map.put(i,i);
        return new IsomorphicGraphMapping<>(map);
    }
}