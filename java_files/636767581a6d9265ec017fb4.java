import java.util.*;

public class Generated_636767581a6d9265ec017fb4 {
    /**
 * The type of key has several upper bounds conducted by different function,this function will return a list of the minimum upper bound of each key in the given list.
 **/
    private List<Integer> computeUpperBounds(List<K> keys){
        List<Integer> upperBounds = new ArrayList<>();
        for(K key : keys){
            upperBounds.add(computeUpperBound(key));
        }
        return upperBounds;
    }
}