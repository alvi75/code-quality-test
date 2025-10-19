import java.util.*;

public class Generated_6367675f1a6d9265ec0180cf {
    private static <V,E>boolean isClique(Graph<V,E> graph,Set<V> vertices){
        //if there are only 2 or less then it's not a clique
        if(vertices.size() <= 2) return false;
        //find the first vertex in the subgraph
        V firstVertex = null;
        for(V v:vertices){
            if(firstVertex == null){
                firstVertex = v;
            }else{
                if(!graph.containsEdge(firstVertex,v)){
                    return false;
                }
            }
        }
        //now check that all the edges emanating from the first vertex are also emanating to one of the other vertices
        Set<V> visitedVertices = new HashSet<>();
        Queue<V> queue = new ArrayDeque<>();
        queue.addFirst(firstVertex);
        while (!queue.isEmpty()){
            V curr = queue.remove();
            if(visitedVertices.contains(curr)) continue;
            visitedVertices.add(curr);
            for(V neighbor: graph.getNeighbors(curr)){
                if(visitedVertices.contains(neighbor)){
                    continue;
                }
                if(graph.containsEdge(curr,neighbor)){
                    queue.addLast(neighbor);
                }
            }
        }
        return true;
    }
}