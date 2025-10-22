import java.util.*;

public class Generated_636767601a6d9265ec0180e2 {
    private List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
        List<Pair<List<Pair<Integer,Integer>>,E>> globalSepList = new ArrayList<>();
        for(E e : this.graph.getEdges()){
            Pair<List<Pair<Integer,Integer>>,E> sepList = computeLocalSeparatorList(e);
            globalSepList.add(sepList);
        }
        return globalSepList;
    }
}