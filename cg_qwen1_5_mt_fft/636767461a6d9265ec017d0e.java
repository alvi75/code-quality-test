import java.util.*;

public class Generated_636767461a6d9265ec017d0e {
    private Pair<List<Integer>,Long> computeSuffixSuffixes(List<Integer> bounds) {
        List<Integer> lcp = new ArrayList<>();
        long sum = 0;
        for (int i = 1; i < bounds.size(); i++) {
            int j = bounds.get(i);
            while (i > 0 && j > 0 && sfx[i - 1] == sfx[j - 1]) {
                i--;
                j--;
            }
            if (i > 0) {
                lcp.add(j - i);
                sum += j - i;
            } else {
                lcp.add(0);
            }
        }

        return new Pair<>(lcp, sum);
    }
}