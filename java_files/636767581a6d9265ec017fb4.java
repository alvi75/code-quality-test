import java.util.*;

public class Generated_636767581a6d9265ec017fb4 {
    private List<Integer> computeUpperBounds(List<K> keys){
        List<Integer> upperBounds = new ArrayList<>(keys.size());
        for(K k : keys){
            int ub = computeUpperBound(k);
            if(ub == Integer.MAX_VALUE)
                throw new RuntimeException("The key " + k.toString() + " is not in the range of this bloom filter.");
            upperBounds.add(ub);
        }
        return upperBounds;
    }
}