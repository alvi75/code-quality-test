import java.util.*;

public class Generated_636767461a6d9265ec017d0e {
    private Pair<List<Integer>,Long> computeSuffixSum(List<Integer> bounds){
        List<Integer> suffixSums = new ArrayList<>();
        long sum = 0;
        for (int i = 0; i < bounds.size(); i++) {
            if (i == 0) {
                suffixSums.add(0);
                sum += bounds.get(i);
            } else {
                int prevIndex = i - 1;
                suffixSums.add(suffixSums.get(prevIndex) + bounds.get(i));
                sum += (suffixSums.get(prevIndex) * (prevIndex - i + 1));
            }
        }

        return new Pair<>(suffixSums, sum);
    }
}