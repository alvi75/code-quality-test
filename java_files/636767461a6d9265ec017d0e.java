import java.util.*;

public class Generated_636767461a6d9265ec017d0e {
    private Pair<List<Integer>,Long> computeSuffixSum(List<Integer> bounds){
        List<Integer> suffixSum = new ArrayList<>();
        long total = 0;
        for(int i=bounds.size()-1;i>=0;--i){
            total += bounds.get(i);
            suffixSum.add(total);
        }
        Collections.reverse(suffixSum);
        return new Pair<>(suffixSum, total);
    }
}