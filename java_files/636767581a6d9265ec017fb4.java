import java.util.*;

public class Generated_636767581a6d9265ec017fb4 {
    private List<Integer> computeUpperBounds(List<K> keys){
        if (keys == null || keys.size() == 0) {
            throw new IllegalArgumentException("key list is empty.");
        }
        //get the first element as the lower bound.
        K k = keys.get(0);
        int minBound = getMinKey(k).hashCode();
        List<Integer> result = new ArrayList<>();
        for (K key : keys) {
            int hashCode = getKeyHashCode(key);
            if (minBound > hashCode) {
                minBound = hashCode;
            }
            result.add(minBound);
        }
        return result;
    }
}