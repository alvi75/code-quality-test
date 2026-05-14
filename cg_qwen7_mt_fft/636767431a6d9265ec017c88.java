import java.util.*;

public class Generated_636767431a6d9265ec017c88 {
    private List<Integer> computeLowerBounds(List<K> keys) {
        if (keys.size() == 0)
            return Collections.emptyList();
        int min = Integer.MAX_VALUE;
        for (K key : keys) {
            int index = indexOf(key);
            if (index < min)
                min = index;
        }
        List<Integer> result = new ArrayList<>();
        for (int i=0; i<keys.size(); ++i) {
            K key = keys.get(i);
            int index = indexOf(key);
            if (index <= min)
                result.add(i);
        }
        return result;
    }
}