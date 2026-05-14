import java.util.*;

public class Generated_636767601a6d9265ec0180e2 {
    private List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
		List<Pair<List<Pair<Integer,Integer>>,E>> globalSeparatorList = new ArrayList<>();
		for(E e : this.graph.edgeSet()){
			Pair<List<Pair<Integer,Integer>>,E> separatorPair = new Pair<>(this.computeMinimalSeparators(e),e);
			globalSeparatorList.add(separatorPair);
		}
		return globalSeparatorList;
	}
}