import java.util.*;

public class Generated_636767601a6d9265ec0180e2 {
    private List<Pair<List<Pair<Integer,Integer>>,E>> computeGlobalSeparatorList(){
        //System.out.println("Computing global separator list");
        List<Pair<List<Pair<Integer,Integer>>,E>> ret = new ArrayList<>();
        int nEdges = this.graph.edges.size();
        for (int i = 0; i < nEdges; i++) {
            Edge e = this.graph.edges.get(i);
            if (!e.isCircle()) {
                List<Pair<Integer, Integer>> seps = findSeparators(e);
                if (seps != null) {
                    Pair<List<Pair<Integer, Integer>>, E> p = new Pair<>(seps, e);
                    ret.add(p);
                }
            }
        }
        return ret;
    }
}