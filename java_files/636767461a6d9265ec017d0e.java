import java.util.*;

public class Generated_636767461a6d9265ec017d0e {
    /**
 * Return a pair of the list of suffix sum and the sum of all elements of bounds.
 */
    private Pair<List<Integer>,Long> computeSuffixSum(List<Integer> bounds){
        List<Integer> suffixSum = new ArrayList<>();
        Long sum = 0L;
        for(int i=bounds.size()-1;i>=0;--i){
            int bound = bounds.get(i);
            if(bound==0) continue;

            //Compute the sum of all elements in [0, bound)
            long tmp = 0L;
            for(int j=0;j<bound;++j){
                tmp += j+1;
            }
            suffixSum.add(tmp);

            //Add to the sum of all elements in [0, bound]
            sum += tmp + (long)(bound*(bound+1))/2;
        }

        return new Pair<>(suffixSum,sum);
    }
}