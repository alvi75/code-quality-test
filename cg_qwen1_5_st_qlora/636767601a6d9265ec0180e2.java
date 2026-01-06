import java.util.*;

public class Generated_636767601a6d9265ec0180e2 {
    private List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
		List<Pair<List<Pair<Integer,Integer>>,E>> result = new ArrayList<>();
		for (int i=0;i<graph.size();i++){
			if (!isCircle(i)){
				result.add(computeLocalSeparatorList(graph.getEdge(i)));
			}
		}
		return result;
	}
}