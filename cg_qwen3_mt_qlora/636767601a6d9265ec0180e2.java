import java.util.*;

public class Generated_636767601a6d9265ec0180e2 {
    private List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
		List<Pair<List<Pair<Integer,Integer>>,E>> globalSeparators = new ArrayList<>();
		
		for(E e : this.graph.getEdges()){
			List<Pair<Integer,Integer>> localSeparators = computeLocalSeparatorList(e);
			
			if(localSeparators.size() > 0){
				globalSeparators.add(new Pair<>(localSeparators,e));
			}
		}
		
		return globalSeparators;
	}
}