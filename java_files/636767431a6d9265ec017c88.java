import java.util.*;

public class Generated_636767431a6d9265ec017c88 {
    private List<Integer> computeLowerBounds(List<K> keys) {
        List<Integer> lowerBounds = new ArrayList<>();
        for (K key : keys) {
            lowerBounds.add(0);
        }
        for (int i = 1; i < keys.size(); i++) {
            K previousKey = keys.get(i - 1);
            K currentKey = keys.get(i);

            int index = Arrays.binarySearch(previousKey, currentKey);
            if (index >= 0) {
                lowerBounds.set(index + 1, Math.max(lowerBounds.get(index), currentKey.hashCode()));
            } else {
                lowerBounds.set(Math.abs(index + 1), currentKey.hashCode());
            }
        }

        return lowerBounds;
    }
}