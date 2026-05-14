import java.util.*;

public class Generated_636767601a6d9265ec0180e2 {
    /**Select an edge which isn't a circle in the graph,compute the list of the minimal separators in the neighborhood of the edge and put the pair of list and edge into the return list.Repeat for each edge in the graph and then return the final list.**/
    private List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
        List<Pair<List<Pair<Integer,Integer>>,E>> globalSeparatorList = new ArrayList<>();
        Iterator<E> it = this.edgeIterator();
        while(it.hasNext()){
            E e = it.next();
            if(!isCircle(e)){
                globalSeparatorList.add(new Pair<>(this.computeMinimalSeparators(e),e));
            }
        }
        return globalSeparatorList;
    }
}