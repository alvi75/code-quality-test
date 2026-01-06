import java.util.*;

public class Generated_636767601a6d9265ec0180e2 {
    private List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
		List<Pair<List<Pair<Integer,Integer>>,E>> globalSeparatorList = new ArrayList<>();
		for (E e : this.graph.edges()){
			if (!this.graph.isCircle(e)){
				globalSeparatorList.addAll(this.computeLocalSeparatorList(e));
			}
		}
		return globalSeparatorList;
	}
}