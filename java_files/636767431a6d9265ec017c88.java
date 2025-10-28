import java.util.*;

public class Generated_636767431a6d9265ec017c88 {
    private List<Integer> computeLowerBounds(List<K> keys) {
        List<Integer> result = new ArrayList<>();
        for (K k : keys) {
            int index = 0;
            while (index < this.keys.size() && !this.keys.get(index).equals(k)) {
                index++;
            }
            if (index == this.keys.size()) {
                throw new IllegalArgumentException("Key not found");
            } else {
                result.add(this.lowerBound[index]);
            }
        }

        return result;
    }
}