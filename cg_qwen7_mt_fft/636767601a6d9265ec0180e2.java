import java.util.*;

public class Generated_636767601a6d9265ec0180e2 {
    private List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
		List<Pair<List<Pair<Integer,Integer>>,E>> gs = new ArrayList<Pair<List<Pair<Integer,Integer>>,E>>();
		
		for(E e : edges){
			if(!isInTree(e)){
				gs.add(computeSeparatorsForEdge(e));
			}
		}

		return gs;
	}
}