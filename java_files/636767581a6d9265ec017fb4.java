import java.util.*;

public class Generated_636767581a6d9265ec017fb4 {
    private List<Integer> computeUpperBounds(List<K> keys){
        List<Integer> upperBounds = new ArrayList<>();
        for(K key:keys){
            upperBounds.add(computeUpperBound(key));
        }
        return upperBounds;
    }
}