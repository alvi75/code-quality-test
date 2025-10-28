import java.util.*;

public class Generated_636767461a6d9265ec017d0e {
    private Pair<List<Integer>,Long> computeSuffixSum(List<Integer> bounds) {
        List<Integer> suffixSum = new ArrayList<Integer>();
        long sum = 0;
        for (int i = 0; i < bounds.size(); i++) {
            int bound = bounds.get(i);
            if (i == 0 || bounds.get(i - 1) + 1 != bound) {
                suffixSum.add(bound);
                sum += bound;
            }
        }
        return new Pair<>(suffixSum, sum);
    }
}