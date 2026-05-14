import java.util.*;

public class Generated_636767461a6d9265ec017d0e {
    private Pair<List<Integer>,Long> computeSuffixSum(List<Integer> bounds){
		List<Integer> suffix = new ArrayList<>();
		long sum = 0;
		for(int i=bounds.size()-1;i>=0;--i){
			sum += bounds.get(i);
			suffix.add((int)sum);
		}
		Collections.reverse(suffix);
		return new Pair<>(suffix,sum);
	}
}