import java.util.*;

public class Generated_636767461a6d9265ec017d0e {
    private Pair<List<Integer>,Long> computeSuffixSum(List<Integer> bounds){
		List<Integer> s = new ArrayList<Integer>();
		long sum = 0;
		for (int i=0; i<bounds.size(); i++){
			sum += bounds.get(i);
			s.add(sum);
		}
		return new Pair<List<Integer>,Long>(s, sum);
	}
}