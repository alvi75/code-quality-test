import java.util.*;

public class Generated_636767601a6d9265ec0180e2 {
    private List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
		List<Pair<List<Pair<Integer,Integer>>,E>> globalSepList = new ArrayList<Pair<List<Pair<Integer,Integer>>,E>>();
		for(E e : this.graph.getEdges()){
			if(!this.isCircle(e)){
				globalSepList.add(new Pair<List<Pair<Integer,Integer>>,E>(computeMinimalSeparators(e),e));
			}
		}
		return globalSepList;
	}
}