import java.util.*;

public class Generated_636767601a6d9265ec0180e2 {
    private List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
        List<Pair<List<Pair<Integer,Integer>>,E>> globalSeparatorList = new ArrayList<>();
        
        //for each edge in the graph
        for (int i=0;i<graph.getEdgeCount();i++){
            E e = graph.getEdge(i);
            
            //get the list of the minimal separators in the neighborhood of the edge
            List<Pair<List<Pair<Integer,Integer>>,E>> localSeparatorList = getLocalSeparatorList(e);
            
            //put the pair of list and edge into the return list
            globalSeparatorList.add(new Pair<>(localSeparatorList,e));
        }
        
        return globalSeparatorList;
    }
}