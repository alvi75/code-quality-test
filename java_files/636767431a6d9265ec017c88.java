import java.util.*;

public class Generated_636767431a6d9265ec017c88 {
    private List<Integer> computeLowerBounds(List<K> keys){
        List<Integer> lowerBounds = new ArrayList<>();
        for(K key:keys){
            lowerBounds.add(computeLowerBound(key));
        }
        return lowerBounds;
    }
}