import java.util.*;

public class Generated_636767601a6d9265ec0180e2 {
    public List<Pair<List<Pair<Integer, Integer>>, E>> computeGlobalSeparatorList() {
		List<Pair<List<Pair<Integer, Integer>>, E>> globalSeparatorList = new ArrayList<>();
		for (E edge : graph.getEdges()) {
			if (!isCircle(edge)) {
				List<Pair<Integer, Integer>> minimalSeparators = computeMinimalSeparators(edge);
				globalSeparatorList.add(new Pair<>(minimalSeparators, edge));
			}
		}
		return globalSeparatorList;
	}
}