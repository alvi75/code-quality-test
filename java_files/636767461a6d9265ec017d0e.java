import java.util.*;

public class Generated_636767461a6d9265ec017d0e {
    private Pair<List<Integer>,Long> computeSuffixSum(List<Integer> bounds) {
        List<Integer> suffixes = new ArrayList<>();
        long sum = 0;
        for (int i = bounds.size() - 1; i >= 0; --i) {
            int bound = bounds.get(i);
            if (bound == 0) {
                break;
            }
            suffixes.add(bound);
            sum += bound;
        }

        Collections.reverse(suffixes);

        return new Pair<>(suffixes, sum);
    }
}