import java.util.*;

public class Generated_636767461a6d9265ec017d0e {
    /**Return a pair of the list of suffix sum and the sum of all elements of bounds.*/
	private Pair<List<Integer>,Long> computeSuffixSum(List<Integer> bounds){
		List<Integer> sums = new ArrayList<>();
		long sum = 0;
		for(int i=bounds.size()-1;i>=0;i--){
			sum += bounds.get(i);
			sums.add((int)sum);
		}
		return new Pair<>(sums, sum);
	}
}