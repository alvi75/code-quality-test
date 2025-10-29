import java.util.*;

public class Generated_636767461a6d9265ec017d0e {
    /**Return a pair of the list of suffix sum and the sum of all elements of bounds.**/
    private Pair<List<Integer>,Long> computeSuffixSum(List<Integer> bounds){
        List<Integer> suffixSum = new ArrayList<>();
        long sum = 0;
        for (int i = 0; i < bounds.size(); i++){
            if (i == 0) {
                suffixSum.add(0);
                sum += bounds.get(i);
            } else {
                suffixSum.add(sum + bounds.get(i));
                sum -= bounds.get(i - 1);
            }
        }
        return new Pair<>(suffixSum, sum);
    }
}