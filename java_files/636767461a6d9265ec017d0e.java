import java.util.*;

public class Generated_636767461a6d9265ec017d0e {
    private Pair<List<Integer>,Long> computeSuffixSum(List<Integer> bounds){
		List<Integer> suffixSum = new ArrayList<>();
		Long sum = 0L;
		for(int i=0;i<bounds.size();i++){
			suffixSum.add(sum);
			sum += bounds.get(i);
		}
		return new Pair<>(suffixSum,sum);
	}
}