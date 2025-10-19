import java.util.*;

public class Generated_636767601a6d9265ec0180e2 {
    private List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
		List<Pair<List<Pair<Integer,Integer>>,E>> globalSeparatorList = new ArrayList<Pair<List<Pair<Integer,Integer>>,E>>();
		for (int i=0;i<edges.size();i++){
			E e = edges.get(i);
			if (!e.isCircle()){
				globalSeparatorList.add(computeLocalSeparatorList(e));
			}
		}
		return globalSeparatorList;
	}
}