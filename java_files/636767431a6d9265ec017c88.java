import java.util.*;

public class Generated_636767431a6d9265ec017c88 {
    private List<Integer> computeLowerBounds(List<K> keys){
        List<Integer> lowerBound = new ArrayList<>();
        for (K k : keys) {
            Integer lb = this.lowerBoundMap.get(k);
            if(lb == null)
                throw new IllegalArgumentException("key " + k + " not found");
            lowerBound.add(lb);
        }
        return lowerBound;
    }
}