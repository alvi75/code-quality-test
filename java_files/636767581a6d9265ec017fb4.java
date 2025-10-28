import java.util.*;

public class Generated_636767581a6d9265ec017fb4 {
    private List<Integer> computeUpperBounds(List<K> keys) {
        List<Integer> result = new ArrayList<>();
        for (K k : keys) {
            int upperBound = 0;
            if (k instanceof Integer) {
                upperBound = ((Integer) k);
            } else if (k instanceof Long) {
                upperBound = ((Long) k).intValue();
            } else if (k instanceof Short) {
                upperBound = ((Short) k).intValue();
            } else if (k instanceof Byte) {
                upperBound = ((Byte) k).intValue();
            }
            result.add(upperBound);
        }

        return result;
    }
}