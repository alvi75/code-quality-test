import java.util.*;

public class Generated_636767461a6d9265ec017d0e {
    private Pair<List<Integer>,Long> computeSuffixSum(List<Integer> bounds){
        List<Integer> suffixSum = new ArrayList<>();
        long sum = 0;
        for (int i = 0; i < bounds.size(); i++) {
            int start = bounds.get(i);
            int end = bounds.get(i + 1) - 1;
            if (start == 0 && end == bounds.size() - 1) {
                suffixSum.add(0L);
                sum += bounds.get(i);
            } else if (start > 0 && end == bounds.size() - 1) {
                suffixSum.add(start * (end - start + 1));
                sum += start * (end - start + 1);
            } else if (start > 0 && end > 0) {
                suffixSum.add((start - 1) * (end - start + 1));
                sum += (start - 1) * (end - start + 1);
            }
        }
        return new Pair<>(suffixSum, sum);
    }
}