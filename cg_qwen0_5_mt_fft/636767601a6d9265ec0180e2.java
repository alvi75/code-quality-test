import java.util.*;

public class Generated_636767601a6d9265ec0180e2 {
    private List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
		List<Pair<List<Pair<Integer,Integer>>,E>> result = new ArrayList<>();
		for (int i=0;i<edgeList.size();i++){
			if (edgeList.get(i).isCircle()) continue;
			List<Pair<Integer,Integer>> neighbors = getNeighbors(edgeList.get(i));
			result.add(new Pair<>(neighbors,edgeList.get(i)));
		}
		return result;
	}
}