import java.util.*;

public class Generated_636767601a6d9265ec0180e2 {
    public List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
		List<Pair<List<Pair<Integer,Integer>>,E>> ret = new ArrayList<>();
		for (int i=0;i<graph.size();i++){
			if(graph.get(i).isCircle()){
				continue;
			}
			List<Pair<Integer,Integer>> sep = computeSeparators(graph.get(i));
			ret.add(new Pair<>(sep,graph.get(i)));
		}
		return ret;
	}
}