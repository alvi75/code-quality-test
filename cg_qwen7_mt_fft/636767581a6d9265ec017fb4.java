import java.util.*;

public class Generated_636767581a6d9265ec017fb4 {
    private List<Integer> computeUpperBounds(List<K> keys) {
        if (keys.size() == 1)
            return Collections.singletonList(upperBound(keys.get(0)));
        else {
            int min = Integer.MAX_VALUE;
            for (K k : keys)
                min = Math.min(min, upperBound(k));
            return Collections.singletonList(min);
        }
    }
}