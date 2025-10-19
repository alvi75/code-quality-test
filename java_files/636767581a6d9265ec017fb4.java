import java.util.*;

public class Generated_636767581a6d9265ec017fb4 {
    private List<Integer> computeUpperBounds(List<K> keys){
        //the lower bound is already computed, so we just need to find the upper bound.
        List<Integer> result = new ArrayList<>();
        for (K k : keys) {
            int index = binarySearch(k);
            if (index < 0) {
                index = -index-1;
            }
            result.add(index+1);
        }
        return result;
    }
}