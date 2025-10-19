import java.util.*;

public class Generated_6367675f1a6d9265ec0180cf {
    private static <V,E>boolean isClique(Graph<V,E> graph,Set<V> vertices){
        Set<Set<E>> sets = new HashSet<Set<E>>();
        for (int i = 0; i < vertices.size(); i++) {
            V vertex = vertices.iterator().next();
            //System.out.println("vertex: " + vertex);
            Set<E> set = Sets.newHashSet();
            for (E e : graph.edges(vertex)) {
                set.add(e);
            }
            if (set.size() == 1) {
                sets.add(set);
            }
        }

        boolean result = false;
        for (Set<E> s : sets) {
            if (s.size() == 2) {
                result = true;
                break;
            }
        }
        return result;
    }
}