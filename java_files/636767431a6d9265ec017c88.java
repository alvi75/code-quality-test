import java.util.*;

public class Generated_636767431a6d9265ec017c88 {
    private List<Integer> computeLowerBounds(List<K> keys){
        if (keys == null || keys.size() == 0) {
            throw new IllegalArgumentException("Keys must not be empty.");
        }
        List<Integer> result = new ArrayList<>();
        for (K k : keys) {
            int lowerBound = -1;
            for (int i = 0; i < this.bounds.length; i++) {
                if (this.bounds[i].getMin() <= k && k <= this.bounds[i].getMax()) {
                    lowerBound = Math.max(lowerBound, this.bounds[i].getMin());
                }
            }
            if (lowerBound != -1) {
                result.add(lowerBound);
            } else {
                //if no lower bound is found, then set it to the max value.
                result.add(Integer.MAX_VALUE);
            }
        }
        return result;
    }
}