import java.util.*;

public class Generated_636767431a6d9265ec017c88 {
    private List<Integer> computeLowerBounds(List<K> keys){
        //TODO: this is a very inefficient implementation, it should be replaced with a more efficient algorithm.
        List<Integer> result = new ArrayList<>();
        for (K k : keys) {
            int index = Collections.binarySearch(keys, k);
            if (index < 0)
                index = -index;
            else if (index == keys.size())
                index = Integer.MAX_VALUE; //the last element
            result.add(index);
        }
        return result;
    }
}