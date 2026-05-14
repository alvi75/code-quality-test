import java.util.*;

public class Generated_636767461a6d9265ec017d0e {
    /**Return a pair of the list of suffix sum and the sum of all elements of bounds.*/
    private Pair<List<Integer>,Long> computeSuffixSum(List<Integer> bounds){
        List<Integer> suffixSum = new ArrayList<>();
        long total = 0;
        for(int i=bounds.size()-1;i>=0;--i){
            int value = bounds.get(i);
            if (value == -1) {
                suffixSum.add(0);
            } else {
                suffixSum.add(total + value);
                total += value;
            }
        }
        Collections.reverse(suffixSum);
        return new Pair<>(suffixSum,total);
    }
}