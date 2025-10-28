import java.util.*;

public class Generated_636767581a6d9265ec017fb4 {
    private List<Integer> computeUpperBounds(List<K> keys) {
        List<Integer> upperBounds = new ArrayList<>();
        for (K key : keys) {
            upperBounds.add(0);
        }
        for (int i = 1; i < keys.size(); i++) {
            K previousKey = keys.get(i - 1);
            K currentKey = keys.get(i);

            int index = Arrays.binarySearch(previousKey, currentKey);
            if (index >= 0) {
                upperBounds.set(index + 1, Math.max(upperBounds.get(index), currentKey.hashCode()));
            } else {
                upperBounds.set(Math.abs(index + 1), currentKey.hashCode());
            }
        }

        return upperBounds;
    }
}