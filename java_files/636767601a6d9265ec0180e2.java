import java.util.*;

public class Generated_636767601a6d9265ec0180e2 {
    private List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
		List<Pair<List<Pair<Integer,Integer>>,E>> result = new ArrayList<Pair<List<Pair<Integer,Integer>>,E>>();
		for(E e:graph.getAllEdges()){
			result.add(computeSeparatorList(e));
		}
		return result;
	}
}