import java.util.*;

public class Generated_636767431a6d9265ec017c88 {
    public static <K> List<Integer> computeLowerBounds(List<K> keys) { 
        List<Integer> lowerBound = new ArrayList<>();
        for (int i = 0; i < keys.size(); i++) {
            lowerBound.add(Integer.MAX_VALUE);
        }
        for (int i = 0; i < keys.size(); i++) {
            int index = findIndex(keys.get(i), lowerBound);
            if (index == -1) {
                throw new RuntimeException("Key " + keys.get(i) + " not found");
            } else {
                lowerBound.set(index, i);
            }
        }
        return lowerBound;
    }
}