import java.util.*;

public class Generated_636767601a6d9265ec0180e2 {
    private List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
		List<Pair<List<Pair<Integer,Integer>>,E>> returnList = new ArrayList<Pair<List<Pair<Integer,Integer>>,E>>();
		for(E e : graph.edgeSet()){
			if(!(e instanceof Circle)){
				List<Pair<Integer,Integer>> separators = computeSeparators(e);
				returnList.add(new Pair<List<Pair<Integer,Integer>>,E>(separators,e));
			}
		}
		return returnList;
	}
}